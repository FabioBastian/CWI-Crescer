import { axiosInstance } from "../index";

export async function incluirPost(imagem, descricao, privacidade) {
  const response = await axiosInstance.post("/posts", {
    imagem,
    descricao,
    privacidade,
  });
  return response.data;
}
