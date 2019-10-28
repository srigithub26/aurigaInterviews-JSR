import React from 'react'

    const Devices = ({ devices }) => {
      return (
        <div>
          <h2 class="card-header">Device List</h2>
          {devices.map((device) => (
            <div class="card">
              <div class="card-body">
                <h3 class="card-text"> name : {device.name}</h3>
                <h3 class="card-text"> agentVersion : {device.agentVersion}</h3>
                <h3 class="card-text"> howManyAlerts: {device.howManyAlerts}</h3>
                <h3 class="card-text"> architecture: {device.architecture}</h3>
                <h3 class="card-text"> collector: {device.collector.collectorName}</h3>
                <h3 class="card-text"> cpuModel: {device.cpuModel}</h3>
                <h3 class="card-text"> description : {device.description}</h3>
                <h3 class="card-text"> discoveryDate : {device.discoveryDate}</h3>
                <h3 class="card-text"> ipAddresses: {device.ipAddresses.join(',')}</h3>
                
              </div>
            </div>
          ))}
        </div>
      )
    };
export default Devices