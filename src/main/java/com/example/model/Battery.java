package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "battery")
public class Battery implements Serializable {

	private static final long serialVersionUID = -2343243243242432341L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="batteryid")
	private long batteryId;
	
	@Column(name="manufacturer")
	private String manufacturer;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	@Column(name="capacity")
	private String capacity;
	
	@Column(name="range_in_km")
	private int range_in_km;
	
	@Column(name="range_in_mi")
	private int range_in_mi;
	
	@Column(name="wh_per_km")
	private int wh_per_km;
	
	@Column(name="wh_per_mi")
	private int wh_per_mi;
	
	@Column(name="energycost_per_km")
	private float energycost_per_km;
	
	@Column(name="energycost_per_mi")
	private float energycost_per_mi;
	
	@Column(name="charge_times")
	private String charge_times;
	
	
	public Battery() {
		super();
	}
	
	

	public Battery(long batteryId, String manufacturer, String make, String model, String capacity, int range_in_km,
			int range_in_mi, int wh_per_km, int wh_per_mi, float energycost_per_km, float energycost_per_mi,
			String charge_times) {
		super();
		this.batteryId = batteryId;
		this.manufacturer = manufacturer;
		this.make = make;
		this.model = model;
		this.capacity = capacity;
		this.range_in_km = range_in_km;
		this.range_in_mi = range_in_mi;
		this.wh_per_km = wh_per_km;
		this.wh_per_mi = wh_per_mi;
		this.energycost_per_km = energycost_per_km;
		this.energycost_per_mi = energycost_per_mi;
		this.charge_times = charge_times;
	}



	public long getBatteryId() {
		return batteryId;
	}

	public void setBatteryId(long batteryId) {
		this.batteryId = batteryId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getRange_in_km() {
		return range_in_km;
	}

	public void setRange_in_km(int range_in_km) {
		this.range_in_km = range_in_km;
	}

	public int getRange_in_mi() {
		return range_in_mi;
	}

	public void setRange_in_mi(int range_in_mi) {
		this.range_in_mi = range_in_mi;
	}

	public int getWh_per_km() {
		return wh_per_km;
	}

	public void setWh_per_km(int wh_per_km) {
		this.wh_per_km = wh_per_km;
	}

	public int getWh_per_mi() {
		return wh_per_mi;
	}

	public void setWh_per_mi(int wh_per_mi) {
		this.wh_per_mi = wh_per_mi;
	}

	public float getEnergycost_per_km() {
		return energycost_per_km;
	}

	public void setEnergycost_per_km(float energycost_per_km) {
		this.energycost_per_km = energycost_per_km;
	}

	public float getEnergycost_per_mi() {
		return energycost_per_mi;
	}

	public void setEnergycost_per_mi(float energycost_per_mi) {
		this.energycost_per_mi = energycost_per_mi;
	}

	public String getCharge_times() {
		return charge_times;
	}

	public void setCharge_times(String charge_times) {
		this.charge_times = charge_times;
	}



	@Override
	public String toString() {
		return "Battery [batteryId=" + batteryId + ", manufacturer=" + manufacturer + ", make=" + make + ", model="
				+ model + ", capacity=" + capacity + ", range_in_km=" + range_in_km + ", range_in_mi=" + range_in_mi
				+ ", wh_per_km=" + wh_per_km + ", wh_per_mi=" + wh_per_mi + ", energycost_per_km=" + energycost_per_km
				+ ", energycost_per_mi=" + energycost_per_mi + ", charge_times=" + charge_times + "]";
	}
	
	
}
