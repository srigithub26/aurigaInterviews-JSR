import React, {Component} from 'react';
import Devices from './components/devices';

class App extends Component {

    state = {
    		devices : []
    };

    componentDidMount() {
        fetch('/api/availableDevices')
        .then(res => res.json())
        .then((data) => {
          this.setState({ devices: data })
        })
        .catch(console.log)
    }


    render() {
    	return (
    	          <Devices devices={this.state.devices} />
    	        )
    }
}

export default App;
