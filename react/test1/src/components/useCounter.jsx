import React from "react";

function useCounter(initVal){

    const [count, setCount] = useState(initVal)
 
    const incrementCount = () => setCount((count) => count + 1)

    const decrementCount = () => setCount((count) => (count -1, 0))

    return [count, incrementCount, decrementCount]

}

export default useCounter