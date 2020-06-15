package com.example.service;

import java.util.List;

import com.example.model.Battery;

public interface BatteryService {
	
	public List<Battery> getAllBatteries();
	public Battery getBatteryById(long id);
	
}
