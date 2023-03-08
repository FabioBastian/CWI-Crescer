import { axiosInstance } from "../index";

export async function adicionarCurtida(id) {
  const response = await axiosInstance.put(`posts/${id}/curtir`, {});
  return response.data;
}
