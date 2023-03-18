import React from "react";

class First extends React.Component {

  btnFun=()=>{
    console.log("btn")
    let test = this.state.a;
    test++
    this.setState({a: test});
  }


  static getDerivedStateFromProps(props,state) {
    console.log("getDerivedStateFromProps")
    console.log(props)
    console.log(state)
    return null;
  }

  componentDidMount(){
    console.log("componentDidMount")
  }

  componentDidUpdate(){
    console.log("componentDidUpdate")
  }

  constructor(props) {
    console.log("constructor")
    super();

    this.state = {
      a:props.test
    }
  }

  render(){
    console.log("рендер")
    return (
      <div>
          {console.log("return")}
          <button onClick={this.btnFun}>Кнопка</button>
          <div>
            {this.state.a}
          </div>
      </div>
    )
  }
}

export default First