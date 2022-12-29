import React from "react";
import WordInput from "./WordInput";
import WordList from "./WordList";

const style = {
    wrapper : {
        padding : 15,
        display : "flex",
        flexDirection : "row",
        justifiContent : "space-around"
    } }

function WordContainer(props){

    const[words, setWords] = useState(['AAA', 'BBB', 'CCC'])
    
    const addWord = (word) => {
        setWords([...words, words])}

    const removeword = (word) => {
        const filteredWords = words.filter(w=>w!=word)
        setWords([...filteredWords])}

    return (
        <div style={style.wrapper}>
            <WordInput addWord = {addWord}/>
            <WordList words={words} removeword={removeword}/>
        </div>
    );
}

export default WordContainer;