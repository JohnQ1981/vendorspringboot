package com.vendorweb.jq.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vendorweb.jq.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
