import { useState } from "react";
import { useEditarProfile } from "../../../hooks";
import { Container, Form, Label, Input, Button } from "../index";
import "./index.css";

export function EditarPerfil() {
  const [formInput, setFormInput] = useState({
    nome: "",
    imagem: "",
  });

  const { editar, hasError } = useEditarProfile();

  function handleChange(event) {
    const { name, value } = event.target;
    setFormInput((oldFormInput) => ({ ...oldFormInput, [name]: value }));
  }

  async function handleSubmit(event) {
    event.preventDefault();
    await editar(formInput.nome, formInput.imagem);
  }

  return (
    <Container additionalClass="post-user-container">
      <Form className="form" onHandleChange={handleSubmit}>
        <Label forId="nome" content="Name" />
        <Input
          id="nome"
          name="nome"
          type="text"
          value={formInput.nome}
          onHandleChange={(e) => handleChange(e)}
        />
        <Label forId="imagem" content="Profile Image" />
        <Input
          id="imagem"
          name="imagem"
          type="text"
          value={formInput.imagem}
          onHandleChange={(e) => handleChange(e)}
        />
        <span className="warring">{hasError ? hasError : null}</span>
        <Button children="Edit" />
      </Form>
    </Container>
  );
}
