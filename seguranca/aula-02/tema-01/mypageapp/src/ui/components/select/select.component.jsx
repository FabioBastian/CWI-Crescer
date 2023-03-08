import "./index.css";

export function Select({
  id,
  name,
  value,
  children,
  className,
  defaultValue,
  onHandleChange,
}) {
  return (
    <select
      id={id}
      name={name}
      value={value}
      defaultValue={defaultValue}
      className={className}
      onChange={onHandleChange}
    >
      {children}
    </select>
  );
}
