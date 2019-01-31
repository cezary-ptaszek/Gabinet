import React, {Component} from 'react';
import List from "./List";
import Detail from "./Detail";

class VisitSite extends Component {


    constructor() {
        super()
        this.state = {
            selectedMedicineVisitId: 1
        }
    }

    render() {
        return (
            <div>
                <div>
                    <List callback={this.setSelectedMedicineVisitId}/>
                </div>
                <div>
                    <Detail selectedMedicineVisitId={this.props.match.params.id}/>
                </div>
            </div>
        )
    };
}

export default VisitSite;