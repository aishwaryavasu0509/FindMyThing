import React, { Component } from 'react';
import Topbar from "./topbar"
import Box from './box'
import Title from './title'
import UserService from '../services/UserService'
class Main extends Component {
    constructor(props){
        super(props)
        this.state={
            users:[],
            data: "STUDENT MODULE"

        }
    }
componentDidMount(){
    UserService.getUsers().then((response)=>{
        this.setState({users: response.data})
    });
}

change=()=>{
    this.setState({data: this.state.users[0].firstName})
};

    render() { 
        return (
            <div>
                <Topbar />
                <br />
                <Title />
                <br/>
                <br/>
                {/* <p>{
                    this.state.users.map(
                        user =>
                        <p> {user.firstName}<br/>{user.lastName}<br/>{user.age}</p>
                        
                    )
                    }
                </p>     */}
                <div style={{marginLeft:"2px", border:"5px solid black", height:"400px"}}>
                <button onClick={this.change} style={{height:"100px",width: "100%",fontSize: "30px"}}>
                {this.state.data}
                </button>
                <button style={{height:"100px",width: "100%",fontSize: "30px"}}>BUSINESS MODULE</button>
                <button style={{height:"100px",width: "100%",fontSize: "30px"}}>TOURISM MODULE</button>
                <button style={{height:"100px",width: "100%",fontSize: "30px"}}>JOBSEEKER</button>
                {/* <Box  textp="STUDENT MODULE" data={this.state.users}/>
                <Box  textp="TOURISM MODULE"/>
                <Box  textp="BUSINESS MODULE"/>
                <Box  textp="JOB SEEKER MODULE"/>     */}

                </div>
                
             </div>
            
        );
    }
}
 
export default Main;