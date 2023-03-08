import "./index.css";

export function Label({ forId, content, className }) {
  return (
    <label htmlFor={forId} className={className}>
      {content}
    </label>
  );
}
