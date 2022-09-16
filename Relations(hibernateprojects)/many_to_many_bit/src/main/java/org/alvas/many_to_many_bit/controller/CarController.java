package org.alvas.many_to_many_bit.controller;

import java.util.Arrays;
import java.util.List;

import org.alvas.many_to_many_bit.dao.Cardao;
import org.alvas.many_to_many_bit.dto.Car;
import org.alvas.many_to_many_bit.dto.Feature;

public class CarController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Car car2 = new Car();
		
		
		Cardao cardao = new Cardao();
		
		Feature feature1 = new Feature();
		Feature feature2 = new Feature();
		
		car1.setCarName("TESLA");
		car1.setCarprice(10000);
		
		car2.setCarName("KIA");
		car2.setCarprice(89953);
		
		List<Car> cars = Arrays.asList(car1,car2);
		
		feature1.setFeaturename("Automative-drive");
		feature2.setFeaturename("wifi");
		
		List<Feature> features = Arrays.asList(feature1,feature2);
		 
		car1.setFeatures(features);
		car2.setFeatures(features);
		
		feature1.setCars(cars);
		feature2.setCars(cars);
		
		cardao.savecar(cars, features);
		

	}

}
