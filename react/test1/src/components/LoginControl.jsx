import React from "react";
import 

function LoginButton(props) {
    return (
        <button onClick={props.onClick}>
          로그인 
        </button>
    )
}


function LogoutButton(props){
    return(
    <button onClick={props.onClick}> 
        로그아웃
    </button>
    )
}

function LoginControl(props){
    const [isLogin, setIsLosin] = useState(false)
    
    const handleLoginClick = () => {
        setIsLogin(true)
    }

    const handleLogoutClick = () => {
        setIsLogin(false);
    }

    let button;
    button = <LoginButton onClick={handleLoginClick}/>

    return (
        <>
        {button}
        </>
    )
}

export default LoginControl