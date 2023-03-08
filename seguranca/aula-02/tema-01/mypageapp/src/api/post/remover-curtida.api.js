import { axiosInstance } from "../index";

export async function removerCurtida(id) {
  const response = await axiosInstance.delete(`posts/${id}/descurtir`, {});
  return response.data;
}
