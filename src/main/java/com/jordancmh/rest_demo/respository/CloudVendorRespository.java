package com.jordancmh.rest_demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordancmh.rest_demo.model.CloudVendor;

public interface CloudVendorRespository extends JpaRepository<CloudVendor,String>{
    
}
