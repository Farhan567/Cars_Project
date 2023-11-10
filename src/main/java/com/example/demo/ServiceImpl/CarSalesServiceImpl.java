package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Bank;
import com.example.demo.Entity.CarSales;
import com.example.demo.Repository.CarSalesRepo;
import com.example.demo.Service.CarSalesService;

@Service
public class CarSalesServiceImpl implements CarSalesService {
	
	@Autowired
	CarSalesRepo carSalesRepo;

	@Override
	public boolean addCarSales(CarSales carSales) {
		carSalesRepo.save(carSales);
		return true;
	}

	@Override
	public List<CarSales> getAllCarSales() {
		List<CarSales> salesList = carSalesRepo.findAll();
		return salesList;
	}

	@Override
	public boolean isCarExist(Long saleId) {
		Optional<CarSales> car = carSalesRepo.findById(saleId);
		if(car.isPresent())
		{
			return true;
		}else {
			return false;
		}
	}

	@Override
	public CarSales getCarBySaleId(Long saleId) {
		Optional<CarSales> car1 = carSalesRepo.findById(saleId);
		if(car1.isPresent()) {
			return car1.get();
		}
		else {
		return null;
	}
	}

	@Override
	public boolean deleteSaleCar(Long saleId) {
		carSalesRepo.deleteById(saleId);
		return true;
	}

	@Override
	public boolean updateSaleCar(CarSales car) {
		Optional<CarSales> car2 = carSalesRepo.findById(car.getSaleId());
		if(car2.isPresent()) {
			carSalesRepo.save(car);
			return true;
		}else {
			return false;
		}		
}	
}