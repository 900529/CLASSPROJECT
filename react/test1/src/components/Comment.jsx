import React from "react";

function Comment(props){

    return (
        <div className="comment">

            <UserInfo suer={props.user}/>

            {/*회원정보*/}
            
            { /* <div className="userInfo">
            <img className="userImage"
             src="{props.user.imageUrl}"
             alt="{props.user.userName}"
            />
            <div className="userInfoName">
                {props.user.userName}
            </div>
    </div> */} 


            {/*댓글내용*/}
            <div className="content">
                {props.content}
            </div>

            {/*댓글 작성 시간*/}
            <div className="regdate">
                {props.replydate}
            </div>

        </div>
    )

}

export default Comment;