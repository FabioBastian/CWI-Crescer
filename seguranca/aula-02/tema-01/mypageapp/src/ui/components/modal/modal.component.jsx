import { Button, Container, EditarPerfil } from "../../components/";
import "./index.css";

export function Modal({ setModalIsOn, option, setOption, id }) {
  function modalClose() {
    setModalIsOn(false);
    setOption(null);
  }

  return (
    <Container additionalClass="container-modal">
      {option === "EDITAR" ? <EditarPerfil /> : null}
      <Button
        children="Close"
        onActionClick={modalClose}
        additionalClass="modal-close-button"
      />
    </Container>
  );
}
