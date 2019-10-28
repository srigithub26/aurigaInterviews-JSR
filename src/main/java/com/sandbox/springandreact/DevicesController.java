package com.sandbox.springandreact;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sandbox.springandreact.model.DeviceResponse;

@RestController
public class DevicesController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/api/availableDevices")
	public List<DeviceResponse> getAvailableDevices() {

		/*
		 * Start of comment Actual call when following url is working and returning json
		 * response But as of now I took Response.json as assumed response in following
		 * path
		 * 
		 * String theUrl = "https://api.cybergator.co.uk/testing/devices";
		 * ResponseEntity<List<DeviceResponse>> response = restTemplate.exchange(theUrl,
		 * HttpMethod.GET, null, new ParameterizedTypeReference<List<DeviceResponse>>()
		 * { }); List<DeviceResponse> deviceList = response.getBody();
		 * 
		 * End of comment
		 */

		List<DeviceResponse> deviceList = new ArrayList<DeviceResponse>();
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
		try {
			deviceList = mapper.readValue(new File("Response.json"), new TypeReference<List<DeviceResponse>>() {
			});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return deviceList;

	}

}
