import React, { Component } from 'react';
class Box extends Component {
    state = { data: "" };

    render() { 
        return ( 
            <div style={{textAlign:"center",
                // fontSize: "18px", 
                width: "30%",
                height:"150px",
                float: "left",
                margin: "10px",
                marginLeft:"200px",
                backgroundRepeat: "no-repeat",
                border: "5px solid black"}}>
                {this.props.children}
                <br/>
                {/* <img src={this.props.img} alt="c_image" style={{height:"150px", width:"100%"}}></img> */}
                {/* <p style={{fontSize: "30px"}}><b>{this.props.textp}</b></p> */}
                <button style={{height:"100px",width: "100%",fontSize: "30px"}}>{this.props.textp}</button>
               
                <p style={{fontSize: "15px", textAlign:"justify", margin:"5px"}}>{this.props.textp2}</p>
            </div>
         );
    }
}
 
export default Box;