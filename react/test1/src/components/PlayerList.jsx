import React from "react";
import Player from "./Player";

function Team(props) {

    return(
        <div>
            
            <Player playerName='Son' playerNumber='15'></Player>
            <Player playerName='Lee' playerNmuber='17'></Player>
            <Player playerName='Choi' playerNumber='16'></Player>

        </div>
    )
}

export default Team;