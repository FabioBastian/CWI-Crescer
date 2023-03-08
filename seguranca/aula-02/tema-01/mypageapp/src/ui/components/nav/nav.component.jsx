import { useEffect } from "react";
import { NavLink, useLocation } from "react-router-dom";
import "./index.css";

export function Nav() {
  const activeClassName = "active-link";
  const location = useLocation();

  useEffect(() => {}, [location]);

  return (
    <nav className="nav">
      <NavLink
        to="/home-user"
        className={({ isActive }) =>
          isActive ? `link-nav ${activeClassName}` : "link-nav"
        }
      >
        <span> - </span>
      </NavLink>
      <NavLink
        to="/home-user"
        className={({ isActive }) =>
          isActive ? `link-nav ${activeClassName}` : "link-nav"
        }
      >
        <span>Home</span>
      </NavLink>
      <NavLink
        to="/home-user"
        className={({ isActive }) =>
          isActive ? `link-nav ${activeClassName}` : "link-nav"
        }
      >
        <span> - </span>
      </NavLink>
    </nav>
  );
}
