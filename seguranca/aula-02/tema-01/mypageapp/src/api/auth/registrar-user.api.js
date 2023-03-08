import { axiosInstance } from "../_base/axios-instance";

export async function registerUser({
  nomeCompleto,
  email,
  apelido,
  dataNascimento,
  senha,
  imagem,
}) {
  axiosInstance.post("/auth", {
    nomeCompleto,
    email,
    apelido,
    dataNascimento,
    senha,
    imagem,
  });
}
