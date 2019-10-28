package com.sandbox.springandreact.model;

import java.util.List;

public class DeviceInfo {

	private String id;
	private String agentVersion;
	private List<String> alertIds;
	private String architecture;
	private Collector collector;
	private String cpuModel;
	private String cpuNumber;
	private String description;
	private String deviceId;
	private String discoveryDate;
	private String externalIp;
	private String externalIpCordLat;
	private String externalIpCordLong;
	private String externalIpDateUpdated;
	private List<IpAddress> ipAddresses;
	private String isAgentConnected;
	private String lastSeenDate;
	private String name;
	private String osCode;
	private String platform;
	private String registeredDate;
	private String release;
	private String updatesScriptLastRun;

	public DeviceInfo(String id, String agentVersion, List<String> alertIds, String architecture, Collector collector,
			String cpuModel, String cpuNumber, String description, String deviceId, String discoveryDate,
			String externalIp, String externalIpCordLat, String externalIpCordLong, String externalIpDateUpdated,
			List<IpAddress> ipAddresses, String isAgentConnected, String lastSeenDate, String name, String osCode,
			String platform, String registeredDate, String release, String updatesScriptLastRun) {
		super();
		this.id = id;
		this.agentVersion = agentVersion;
		this.alertIds = alertIds;
		this.architecture = architecture;
		this.collector = collector;
		this.cpuModel = cpuModel;
		this.cpuNumber = cpuNumber;
		this.description = description;
		this.deviceId = deviceId;
		this.discoveryDate = discoveryDate;
		this.externalIp = externalIp;
		this.externalIpCordLat = externalIpCordLat;
		this.externalIpCordLong = externalIpCordLong;
		this.externalIpDateUpdated = externalIpDateUpdated;
		this.ipAddresses = ipAddresses;
		this.isAgentConnected = isAgentConnected;
		this.lastSeenDate = lastSeenDate;
		this.name = name;
		this.osCode = osCode;
		this.platform = platform;
		this.registeredDate = registeredDate;
		this.release = release;
		this.updatesScriptLastRun = updatesScriptLastRun;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAgentVersion() {
		return agentVersion;
	}

	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
	}

	public List<String> getAlertIds() {
		return alertIds;
	}

	public void setAlertIds(List<String> alertIds) {
		this.alertIds = alertIds;
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

	public String getCpuNumber() {
		return cpuNumber;
	}

	public void setCpuNumber(String cpuNumber) {
		this.cpuNumber = cpuNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDiscoveryDate() {
		return discoveryDate;
	}

	public void setDiscoveryDate(String discoveryDate) {
		this.discoveryDate = discoveryDate;
	}

	public String getExternalIp() {
		return externalIp;
	}

	public void setExternalIp(String externalIp) {
		this.externalIp = externalIp;
	}

	public String getExternalIpCordLat() {
		return externalIpCordLat;
	}

	public void setExternalIpCordLat(String externalIpCordLat) {
		this.externalIpCordLat = externalIpCordLat;
	}

	public String getExternalIpCordLong() {
		return externalIpCordLong;
	}

	public void setExternalIpCordLong(String externalIpCordLong) {
		this.externalIpCordLong = externalIpCordLong;
	}

	public String getExternalIpDateUpdated() {
		return externalIpDateUpdated;
	}

	public void setExternalIpDateUpdated(String externalIpDateUpdated) {
		this.externalIpDateUpdated = externalIpDateUpdated;
	}

	public List<IpAddress> getIpAddresses() {
		return ipAddresses;
	}

	public void setIpAddresses(List<IpAddress> ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	public String getIsAgentConnected() {
		return isAgentConnected;
	}

	public void setIsAgentConnected(String isAgentConnected) {
		this.isAgentConnected = isAgentConnected;
	}

	public String getLastSeenDate() {
		return lastSeenDate;
	}

	public void setLastSeenDate(String lastSeenDate) {
		this.lastSeenDate = lastSeenDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOsCode() {
		return osCode;
	}

	public void setOsCode(String osCode) {
		this.osCode = osCode;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getUpdatesScriptLastRun() {
		return updatesScriptLastRun;
	}

	public void setUpdatesScriptLastRun(String updatesScriptLastRun) {
		this.updatesScriptLastRun = updatesScriptLastRun;
	}

}
