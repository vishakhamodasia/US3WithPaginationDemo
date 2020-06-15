package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomBattery {
	
	private Long batteryId;
	
	public Long getBatteryId() {
		return batteryId;
	}
	public void setBatteryId(Long batteryId) {
		this.batteryId = batteryId;
	}
	@Override
	public String toString() {
		return "CustomBattery [batteryId=" + batteryId + "]";
	}
}
