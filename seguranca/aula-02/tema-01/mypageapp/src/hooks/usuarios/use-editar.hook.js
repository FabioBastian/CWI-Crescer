import { useState } from "react";
import { editarInfo } from "../../api";

export function useEditarProfile() {
  const [hasError, setError] = useState(null);

  async function editar(nome, imagem) {
    try {
      await editarInfo(nome, imagem);
    } catch (error) {
      setError("Dados invalidos inseridos.");
    }
  }

  return { editar, hasError };
}
