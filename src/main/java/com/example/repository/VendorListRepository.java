package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.VendorList;

@Repository("vendorListRepository")
public interface VendorListRepository extends JpaRepository<VendorList, Long> {

	List<VendorList> findByVendorId(long vendorId);
	
	long deleteByVendorId(long vendorId);

}
