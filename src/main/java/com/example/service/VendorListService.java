package com.example.service;

import java.util.List;

import com.example.model.VendorList;

public interface VendorListService {

	List<VendorList> addItems(List<VendorList> items);

	List<VendorList> getAllItems(long vendorId);

	long deleteItemsByVendorId(long vendorId);
}
