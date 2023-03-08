import { useState, useEffect } from "react";
import { axiosInstance } from "../../api";

export function useGetDetalharUsuario() {
  const [user, setUser] = useState();
  const [isLoading, setIsLoading] = useState(true);
  const [hasError, setError] = useState(null);

  useEffect(() => {
    async function fetchDetalhes() {
      try {
        const responseUrl = await axiosInstance.get("usuarios/detalhar");
        const response = responseUrl.data;
        setUser(response);
      } catch (error) {
        setError("Ocoreu um erro ao buscar os detalhes");
      } finally {
        setIsLoading(false);
      }
    }
    fetchDetalhes();
  }, []);

  async function refreshData() {
    const response = await axiosInstance.get("usuarios/detalhar");
    setUser(response.data);
  }

  return { user, isLoading, hasError, refreshData };
}
