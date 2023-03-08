import "./index.css";

export function Input({ id, name, type, value, className, onHandleChange }) {
  return (
    <input
      id={id}
      name={name}
      type={type}
      value={value}
      className={className}
      onChange={onHandleChange}
    />
  );
}
