import "./index.css";

export function Button({ children, onActionClick, additionalClass }) {
  const fullClassName = additionalClass
    ? `button ${additionalClass}`
    : "button";
  return (
    <button className={fullClassName} onClick={onActionClick}>
      {children}
    </button>
  );
}
