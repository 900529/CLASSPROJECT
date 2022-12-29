import React from "react";


function UserInfo(props) {

    return(
        <div className="userInfo">
          <UserImg user={props.user}/>
          <div className="userInfoName">
              {props.userName}
        </div>
      </div>

    )
}


export default UserInfo;