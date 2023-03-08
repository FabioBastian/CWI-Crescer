import { createBrowserRouter } from "react-router-dom";
import { LoginScreen, HomeUser, RegisterScreen } from "../ui/screens";
import { PrivateRoute } from "./private-route.component";

export const router = createBrowserRouter([
  {
    path: "/",
    element: <LoginScreen />,
  },
  {
    path: "/register",
    element: <RegisterScreen />,
  },
  {
    path: "/home-user",
    element: <PrivateRoute Screen={HomeUser} />,
  },
]);
