package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.VendorList;
import com.example.repository.VendorListRepository;

@Service("vendorListService")
public class VendorListServiceImpl implements VendorListService {

	@Autowired
	private VendorListRepository vendorListRepository;

	@Override
	public List<VendorList> addItems(List<VendorList> items) {
		
		return vendorListRepository.save(items);
	}

	@Override
	public List<VendorList> getAllItems(long vendorId) {
		
		return vendorListRepository.findByVendorId(vendorId);
	}
	
	@Override
	public long deleteItemsByVendorId(long vendorId) {
		return vendorListRepository.deleteByVendorId(vendorId);
	}
}
