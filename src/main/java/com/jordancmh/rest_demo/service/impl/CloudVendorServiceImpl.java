package com.jordancmh.rest_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jordancmh.rest_demo.model.CloudVendor;
import com.jordancmh.rest_demo.respository.CloudVendorRespository;
import com.jordancmh.rest_demo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

    CloudVendorRespository cloudVendorRespository;

    public CloudVendorServiceImpl(CloudVendorRespository cloudVendorRespository) {
        this.cloudVendorRespository = cloudVendorRespository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRespository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRespository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRespository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRespository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRespository.findAll();
    }

}
