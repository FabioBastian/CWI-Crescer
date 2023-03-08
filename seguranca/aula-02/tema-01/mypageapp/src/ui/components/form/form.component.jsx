import "./index.css";

export function Form({ children, className, onHandleChange }) {
  return (
    <form onSubmit={onHandleChange} className={className}>
      {children}
    </form>
  );
}
