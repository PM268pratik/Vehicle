package dao_test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.shani.vehicle.beans.Log;
import com.shani.vehicle.beans.Vehicle;
import com.shani.vehicle.beans.VehicleFilters;
import com.shani.vehicle.dao.VehicleDAO;
import com.shani.vehicle.enums.EuroEmissionsStandard;
import com.shani.vehicle.enums.FuelType;
import com.shani.vehicle.enums.GearboxType;
import com.shani.vehicle.logic.LogController;
import com.shani.vehicle.utils.DateUtils;

public class TestSome {

	public static void main(String[] args) {

		VehicleDAO vehicleDAO = new VehicleDAO();

		
	static Date getDate(LocalDateTime dateToConvert) {
		return java.util.Date.from(dateToConvert.atZone(ZoneId.systemDefault()).toInstant());
	}
}
