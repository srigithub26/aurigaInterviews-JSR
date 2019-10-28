package com.sandbox.springandreact.model;

public class Collector {

	private String tenantId;
	private String collectorId;
	private String collectorName;

	public Collector(String tenantId, String collectorId, String collectorName) {
		super();
		this.tenantId = tenantId;
		this.collectorId = collectorId;
		this.collectorName = collectorName;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getCollectorId() {
		return collectorId;
	}

	public void setCollectorId(String collectorId) {
		this.collectorId = collectorId;
	}

	public String getCollectorName() {
		return collectorName;
	}

	public void setCollectorName(String collectorName) {
		this.collectorName = collectorName;
	}

}
