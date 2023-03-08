import { useState, useEffect } from "react";
import { useLogin } from "../../../hooks/auth/use-login.hook";
import { useNavigate } from "react-router-dom";
import { useGlobalUser } from "../../../context";
import { Button, Container, Form, Input, Label } from "../../components";
import "./index.css";

export function LoginScreen() {
  const [formInput, setFormInput] = useState({ email: "", password: "" });
  const { loginUser, hasError } = useLogin();
  const navigate = useNavigate();
  const [user] = useGlobalUser();

  function handleChange(event) {
    const { name, value } = event.target;

    setFormInput((oldFormInput) => ({ ...oldFormInput, [name]: value }));
  }

  async function handleSubmit(event) {
    event.preventDefault();
    await loginUser(formInput.email, formInput.password);
  }

  useEffect(() => {
    if (user) {
      navigate("/home-user");
    }
  }, [user, navigate]);

  return (
    <Container additionalClass="login-screen">
      <Form className="form" onHandleChange={handleSubmit}>
        <Label forId="username" content="User Name" />
        <Input
          id="username"
          name="email"
          type="text"
          value={formInput.email}
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
        <Button children="Login" />
      </Form>
    </Container>
  );
}
