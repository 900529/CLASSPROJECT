import React from "react";

function TextInputButton(props){
  
    const inputEl = useRef(null);

    const onButtonClick = () => {
        // current는 연결되어있는 객체 input 가르킨다. 
        inputEl.current.focus();
        inputEl.current.value='new Message'
    }

    return (
        <div>
            <input ref = {inputEl} type="text" />
            <button onClick={onButtonClick}> 클릭! </button>
        </div>
    )

}

export default TextInputButton;