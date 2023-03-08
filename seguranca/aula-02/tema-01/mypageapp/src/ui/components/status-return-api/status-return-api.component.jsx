import "./index.css";

export function StatusReturnApi({ isLoading, hasError }) {
  return (
    <>
      {isLoading ? (
        <span className="warring">Conteudo Carregando...</span>
      ) : null}
      {hasError ? <span className="warring">{hasError}</span> : null}
    </>
  );
}
