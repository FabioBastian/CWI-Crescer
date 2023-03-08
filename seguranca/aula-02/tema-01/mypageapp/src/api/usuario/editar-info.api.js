import { axiosInstance } from "../index";

export async function editarInfo(nome, imagem) {
  const response = await axiosInstance.put("/usuarios/alterar", {
    nome,
    imagem,
  });
  return response.data;
}
