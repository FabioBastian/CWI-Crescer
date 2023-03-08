import { useState, useEffect } from "react";
import { useLogout } from "../../../hooks";
import { useGetDetalharUsuario } from "../../../hooks";
import {
  CardUser,
  Container,
  Nav,
  StatusReturnApi,
  Modal,
  Button,
} from "../../components";
import "./index.css";

export function HomeUser() {
  const { logoutUser } = useLogout();
  const { user, isLoading, hasError, refreshData } = useGetDetalharUsuario();
  const [modalIsOn, setModalIsOn] = useState(false);
  const [option, setOption] = useState(null);

  async function onClickLogout() {
    await logoutUser();
  }

  async function handleClickModal(option) {
    setModalIsOn(true);
    setOption(option);
  }

  useEffect(() => {
    refreshData();
  }, [modalIsOn]);

  return (
    <>
      <Container additionalClass="home-user-container">
        <StatusReturnApi hasError={hasError} isLoading={isLoading} />
        <CardUser
          user={user}
          onHandleClick={() => handleClickModal("EDITAR")}
        />
        <Button children="Logout" onActionClick={onClickLogout} />
        {modalIsOn ? (
          <Modal
            setModalIsOn={setModalIsOn}
            option={option}
            setOption={setOption}
          />
        ) : null}
      </Container>
      <Nav />
    </>
  );
}
