package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Battery;
import com.example.repository.BatteryRepository;
import com.example.repository.VendorListRepository;

@Service("batteryService")
public class BatteryServiceImpl implements BatteryService {

	@Autowired
	private BatteryRepository batteryRepository;

	@Override
	public List<Battery> getAllBatteries() {
		return batteryRepository.findAll();
	}

	@Override
	public Battery getBatteryById(long id) {
		return batteryRepository.findOne(id);
	}

}
