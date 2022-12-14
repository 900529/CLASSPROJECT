import React from "react";
import ItemsContext from "./Items";

function Details(props){
    const {idx} = props;
    const {items} = React.useContext(ItemContext);

    return (
        <div>
          {idx > -1?
          <p>
              <h3>{items[idx].id}</h3>
              <h3>{items[idx].name}</h3>
              <h3>{items[idx].price}</h3>
          </p>
           :
          <div> 선택되지 않은 상품 </div>
          }
        </div>
    );
}

export default Details;