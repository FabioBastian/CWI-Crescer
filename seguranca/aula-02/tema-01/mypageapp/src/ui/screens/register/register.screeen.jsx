import { useState, useEffect } from "react";
import { useLogin } from "../../../hooks/auth/use-login.hook";
import { useNavigate } from "react-router-dom";
import { useGlobalUser } from "../../../context";
import { Button, Container, Form, Input, Label } from "../../components";
import "./index.css";

export function RegisterScreen() {
  const [formInput, setFormInput] = useState({
    nome: "",
    email: "",
    imagem: "",
    password: "",
  });
  const { loginUser, hasError } = useLogin();
  const navigate = useNavigate();
  const [user] = useGlobalUser();

  function handleChange(event) {
    const { name, value } = event.target;

    setFormInput((oldFormInput) => ({ ...oldFormInput, [name]: value }));
  }

  async function handleSubmit(event) {
    event.preventDefault();
    await loginUser(
      formInput.nome,
      formInput.email,
      formInput.imagem,
      formInput.password
    );
  }

  function onActionClickNavigate(where) {
    navigate(where);
  }

  useEffect(() => {
    if (user) {
      navigate("/home-user");
    }
  }, [user, navigate]);

  return (
    <Container additionalClass="register-screen">
      <Form className="form" onHandleChange={handleSubmit}>
        <Label forId="nome" content="Nome" />
        <Input
          id="nome"
          name="nome"
          type="text"
          value={formInput.nome}
          onHandleChange={(e) => handleChange(e)}
        />
        <Label forId="email" content="Email" />
        <Input
          id="email"
          name="email"
          type="email"
          value={formInput.email}
          onHandleChange={(e) => handleChange(e)}
        />
        <Label forId="imagem" content="Imagem" />
        <Input
          id="imagem"
          name="imagem"
          type="text"
          value={formInput.imagem}
          onHandleChange={(e) => handleChange(e)}
        />
        <Label forId="password" content="Password" />
        <Input
          id="password"
          name="password"
          type="password"
          value={formInput.password}
          onHandleChange={(e) => handleChange(e)}
        />
        <span className="warring">{hasError ? hasError : null}</span>
        <Button children="Register" />
      </Form>
      <Button
        children="Login"
        onActionClick={() => onActionClickNavigate("/")}
      />
    </Container>
  );
}
