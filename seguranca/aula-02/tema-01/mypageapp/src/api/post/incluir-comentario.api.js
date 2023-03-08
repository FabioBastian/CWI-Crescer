import { axiosInstance } from "../index";

export async function incluirPostComentario(id, conteudo) {
  const response = await axiosInstance.post(`posts/${id}/comentar`, {
    conteudo,
  });
  return response.data;
}
