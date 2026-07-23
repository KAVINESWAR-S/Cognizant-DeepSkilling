import React from "react";
import ReactDOM from "react-dom/client";
import App from "./compounts/App";
import AuthContextProvider from "./context/authContextProvider";

// const root = ReactDOM.createRoot(document.getElementById("root"));

// root.render(
//   <React.StrictMode>
//     <AuthContextProvider>
//       <App />
//     </AuthContextProvider>
//   </React.StrictMode>
// );

import { Provider } from 'react-redux';
import { configureStore } from '@reduxjs/toolkit';
import devActions from './reducers/devReducers';

const store = configureStore({
reducer: devActions.reducer
});

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
<React.StrictMode>
<Provider store={store} >
<App />
</Provider>
</React.StrictMode>
)