import React, {Component} from 'react';
import "./addVisit.css"

class Detail extends Component {

    constructor() {
        super();
        this.state = {
            selectedMedicineVisit: {}
        };
    }

    componentDidMount() {
        fetch('http://localhost:8080/war/visit/', {
  method: 'POST',
  headers: {
    'Accept': 'application/json',
    'Content-Type': 'application/json',
  },
  body: JSON.stringify({
    firstParam: 'yourValue',
    secondParam: 'yourOtherValue',
  })
})
    }

    render() {
       
            };
}

export default Detail;
