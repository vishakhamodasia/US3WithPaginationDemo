package com.example.model;

import java.io.Serializable;

public class VendorListPK implements Serializable{

	private static final long serialVersionUID = -7842144899625014597L;

	private long vendorId;

	private long batteryId;
	
	public VendorListPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VendorListPK(Long vendorId, Long batteryId) {
		super();
		this.vendorId = vendorId;
		this.batteryId = batteryId;
	}


	public Long getVendorId() {
		return vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}
	public Long getBatteryId() {
		return batteryId;
	}
	public void setBatteryId(Long batteryId) {
		this.batteryId = batteryId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (batteryId ^ (batteryId >>> 32));
		result = prime * result + (int) (vendorId ^ (vendorId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VendorListPK other = (VendorListPK) obj;
		if (batteryId != other.batteryId)
			return false;
		if (vendorId != other.vendorId)
			return false;
		return true;
	}
	
	
}
