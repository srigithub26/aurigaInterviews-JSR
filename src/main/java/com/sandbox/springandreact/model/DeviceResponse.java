package com.sandbox.springandreact.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sandbox.springandreact.DeviceResponseDeserializer;

@JsonDeserialize(using = DeviceResponseDeserializer.class)
public class DeviceResponse {

	private String name;
	private String agentVersion;
	private int howManyAlerts;
	private String architecture;
	private Collector collector;
	private String cpuModel;
	private String description;
	private String discoveryDate;
	private List<String> ipAddresses;

	public DeviceResponse(String name, String agentVersion, int howManyAlerts, String architecture, Collector collector,
			String cpuModel, String description, String discoveryDate, List<String> ipAddresses) {
		super();
		this.name = name;
		this.agentVersion = agentVersion;
		this.howManyAlerts = howManyAlerts;
		this.architecture = architecture;
		this.collector = collector;
		this.cpuModel = cpuModel;
		this.description = description;
		this.discoveryDate = discoveryDate;
		this.ipAddresses = ipAddresses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgentVersion() {
		return agentVersion;
	}

	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
	}

	public int getHowManyAlerts() {
		return howManyAlerts;
	}

	public void setHowManyAlerts(int howManyAlerts) {
		this.howManyAlerts = howManyAlerts;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public Collector getCollector() {
		return collector;
	}

	public void setCollector(Collector collector) {
		this.collector = collector;
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiscoveryDate() {
		return discoveryDate;
	}

	public void setDiscoveryDate(String discoveryDate) {
		this.discoveryDate = discoveryDate;
	}

	public List<String> getIpAddresses() {
		return ipAddresses;
	}

	public void setIpAddresses(List<String> ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

}
