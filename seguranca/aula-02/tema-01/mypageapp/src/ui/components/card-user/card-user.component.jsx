import "./index.css";

export function CardUser({ user, onHandleClick }) {
  return (
    <div className="card-user-container">
      <img src={user?.imagem} alt="Imagem do usuario" className="user-img" />
      <div className="user-info-box" onClick={onHandleClick}>
        <span>{user?.nome}</span>
        <span>{user?.email}</span>
        <span>{user?.dataAtualizacao}</span>
      </div>
    </div>
  );
}
