import React from "react";

function WordInput({addWord}){

    const {AddWord} = props;

    const [text, setText] = useState()

    const handelSubmit = (event) => {
        AddWord(text);
        setText('');
    }

    return (
        <div>
            <input
             value={text}
             onChange={(event)=> setText(event.target.value)} />
             <button onClick={handleAddWord}> 단어 추가 </button>
        </div>
    );
}

export default WordInput;