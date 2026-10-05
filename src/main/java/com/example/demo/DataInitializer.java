package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

	
	@Autowired
	private CarRepository crepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		List<CarData>carinfo=new ArrayList<>();
		
		for(int i=1;i<=1000;i++) {
			
			CarData cdata=new CarData();
			
			cdata.setCarName("Thar"+i);
			cdata.setCompanyName("Mahindra");
			cdata.setFuelType("Petrol");
			cdata.setPrice("1500000"+(i * 1000));
			
			carinfo.add(cdata);
			
		}
		
		crepo.saveAll(carinfo);
		System.out.println("1000 Records inserted!");
		
		
	}
}
