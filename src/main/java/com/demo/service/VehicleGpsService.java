package com.demo.service;

import com.demo.dao.entity.VehicleGps;

import java.util.Date;
import java.util.List;

/**
 * Created by wwwwei on 18/1/8.
 */
public interface VehicleGpsService {
    List<VehicleGps> listVehicleGps(String address, Date startDate, Date endDate);

    List<VehicleGps> listVehicleGps(Integer speedLimit);

    List<VehicleGps> listVehicleGps(String gpstime);
}
