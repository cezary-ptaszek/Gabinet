import React, {Component} from 'react';
import './App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
} from 'react-router-dom';
import VisitDetailWidget from "./VISIT_SITE/VisitDetailWidget";
import Detail from "./VISIT_SITE/Detail";
import VisitSite from "./VISIT_SITE/VisitSide";

class App extends Component {
    render() {
        return (
            <Router>
                <div className="container">
                    <header>
                        <nav>
                            <div className="logo">
                               
                            </div>
                            <ul>
                                <li className="active">
                                 <Link to="/visit/0">Visits</Link>
                                </li>
                                 <li>
                                    <Link to="/visit/">Sign up for a visit</Link>
                                </li>
                            </ul>
                        </nav>
                    </header>
                    <main>
                        <Route path="/visit/:id" component={VisitSite}/>
                    </main>
                    <footer>
                        <p>Copyright © przychodnia.stomatologiczna.com - 2019</p>
                    </footer>
                </div>
            </Router>
        );
    }
}

export default App;