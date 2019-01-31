import React, {Component} from 'react';
import {Link} from "react-router-dom";
import "./List.css"

class List extends Component {
    constructor() {
        super();
        this.state = {
            allMedicineVisits: [],
        }
    }

    componentDidMount() {
        fetch("http://localhost:8080/war/visit")
            .then((resp) => resp.json())
            .then(data => {
                this.setState({
                    allMedicineVisits: data,
                });
            })
    }


    render() {
        return (
            <div className="listWrapper">
                <ul>
                    {this.state.allMedicineVisits.map(objectToRender =>
                        <li>
                            <Link to={"/visit/" + objectToRender["id"]}> {objectToRender["releaseDate"]} </Link>
                        </li>)}
                </ul>
            </div>
        )
    };


}

export default List;