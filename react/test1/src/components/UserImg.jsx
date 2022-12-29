import React from "react";


function UserImg(props) {
    return (
    <img className="userImage"
             src="{props.user.imageUrl}"
             alt="{props.user.userName}"
             width="200"
            />
            )
}

 export default UserImg;