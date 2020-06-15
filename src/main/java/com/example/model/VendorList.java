package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "vendorlist")
@IdClass(VendorListPK.class)
public class VendorList {

	 @Id
	 @Column(name="vendorid")
	 private long vendorId;
	 
	 @Id
	 @Column(name="batteryid")
	 private long batteryId;
	 
	 @MapsId("vendorid")
	 @ManyToOne(optional = false,cascade=CascadeType.DETACH)
	 @JoinColumn(name = "vendorid", referencedColumnName = "vendorid")
	 private Vendor vendor;

	 @MapsId("batteryid")
	 @ManyToOne(optional = false,cascade=CascadeType.DETACH)
	 @JoinColumn(name = "batteryid", referencedColumnName = "batteryid")
	 private Battery battery; 
	 
	 public VendorList() {
		super();
		// TODO Auto-generated constructor stub
	 }

	public VendorList(long vendorId, long batteryId) {
		super();
		this.vendorId = vendorId;
		this.batteryId = batteryId;
	}

	public long getVendorId() {
		return vendorId;
	}

	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}

	public long getBatteryId() {
		return batteryId;
	}

	public void setBatteryId(long batteryId) {
		this.batteryId = batteryId;
	}

}
