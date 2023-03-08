import { createBrowserRouter } from "react-router-dom";
import { LoginScreen, HomeUser } from "../ui/screens";
import { PrivateRoute } from "./private-route.component";

export const router = createBrowserRouter([
  {
    path: "/",
    element: <LoginScreen />,
  },
  {
    path: "/home-user",
    element: <PrivateRoute Screen={HomeUser} />,
  },
]);
