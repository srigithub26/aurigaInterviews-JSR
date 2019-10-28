package com.sandbox.springandreact;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.sandbox.springandreact.model.Collector;
import com.sandbox.springandreact.model.DeviceResponse;

public class DeviceResponseDeserializer extends StdDeserializer<DeviceResponse> {

	private static final long serialVersionUID = 1L;

	public DeviceResponseDeserializer() {
		this(null);
	}

	protected DeviceResponseDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public DeviceResponse deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {

		JsonNode node = jp.getCodec().readTree(jp);

		String name = node.get("name").asText();
		String agentVersion = node.get("agentVersion").asText();

		ArrayNode alertIdsNode = (ArrayNode) node.get("alertIds");
		List<String> alertIds = new ArrayList<String>();
		for (JsonNode alertId : alertIdsNode) {
			alertIds.add(alertId.asText());
		}
		alertIds.toArray();

		int howManyAlerts = alertIds.size();

		String architecture = node.get("architecture").asText();
		Collector collector = new Collector(null, null, node.get("collector").get("collectorName").asText());
		String cpuModel = node.get("cpuModel").asText();
		String description = node.get("description").asText();
		String discoveryDate = node.get("discoveryDate").asText();
		List<String> ipAddresses = new ArrayList<>();

		ArrayNode ipAddressesNode = (ArrayNode) node.get("ipAddresses");
		for (JsonNode ipAddress : ipAddressesNode) {
			ipAddresses.add(ipAddress.get("ipAddress").asText());
		}
		ipAddresses.toArray();

		return new DeviceResponse(name, agentVersion, howManyAlerts, architecture, collector, cpuModel, description,
				discoveryDate, ipAddresses);
	}
}
