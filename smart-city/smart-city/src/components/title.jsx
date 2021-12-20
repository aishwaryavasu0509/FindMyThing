import React, { Component } from 'react';
class Title extends Component {
    // state = {  }
    render() { 
        return ( 
            <div style={{backgroundColor: "black", height:"350px",color:"white"}}>
                <div  style={{float:"left", width:"25%", border:"5px solid grey", marginTop:"50px", marginLeft:"20px",height:"250px"}}>
                    <h1 style={{fontSize:"45px",margin:"20px"}}>VIRTUALLY <br />EXPLORE <br/>CITIES!!</h1>
                </div>
                <div style={{width:"55%", right:"0", float:"right",overflow:"hidden", marginTop:"50px", marginLeft:"70px"}}>
                    <img src="smart_city.jpg"  alt="Qnimage" height="250" width="700" ></img>
                </div>
            </div>
         );
    }
}
 
export default Title;