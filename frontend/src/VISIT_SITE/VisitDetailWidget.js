import React, {Component} from 'react';

class VisitDetailWidget extends Component{



    render(){
        return (
            <div>
                <p>id: {this.props.id}</p>
                <p>title: {this.props.title}</p>
                <p>price: {this.props.price}</p>
                <p>rating: {this.props.rating}</p>
                <p>releaseDate: {this.props.releaseDate}</p>
            </div>
        )

    }
}

export default VisitDetailWidget
