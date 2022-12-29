import React from "react";
import ItemsContext from "./Items";
import Details from "./Details";
import Display from "./Display";


const items = [
    {id : 1, name : '상품 1', price : 1000},
    {id : 2, name : '상품 2', price : 2000},
    {id : 3, name : '상품 3', price : 3000},
    {id : 4, name : '상품 4', price : 4000},
    {id : 5, name : '상품 5', price : 5000} ];


function Container(props) {

  const [id, setId] = React.useState(-1);

  const changeItemId = React.useCallback((idx) => {setId(idx);}, [id]);

  return (
        <ItemsContext.Provider value={{items, changeItemId}}>
        <div className="container">
        <Display/>
        <Details idx={id}/>
        </div>
        </ItemsContext.Provider>
    );

}

export default Container;
