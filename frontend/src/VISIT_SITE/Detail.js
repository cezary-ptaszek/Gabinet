import React, {Component} from 'react';
import VisitDetailWidget from "./VisitDetailWidget";
import "./Detail.css"

class Detail extends Component {

    constructor() {
        super();
        this.state = {
            selectedMedicineVisit: {}
        };
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.selectedMedicineVisitId !== this.props.selectedMedicineVisitId) {
            fetch("http://localhost:8080/war/visit/" + nextProps.selectedMedicineVisitId)
                .then((resp) => resp.json())
                .then(data => {
                    this.setState({
                        selectedMedicineVisit: data
                    })
                })
        }
    }

    render() {
        return (
            <div className="detailWrapper">
            <VisitDetailWidget
            id={this.state.selectedMedicineVisit["id"]}
            title={this.state.selectedMedicineVisit["title"]}
            price={this.state.selectedMedicineVisit["price"]}
            rating={this.state.selectedMedicineVisit["rating"]}
            releaseDate={this.state.selectedMedicineVisit["releaseDate"]}
            />
            </div>
        )
    };
}

export default Detail;
