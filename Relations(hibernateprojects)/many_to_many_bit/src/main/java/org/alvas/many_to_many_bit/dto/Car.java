package org.alvas.many_to_many_bit.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carid;
	@CreationTimestamp
	private LocalDateTime dateTime;

	private String carName;
	private double carprice;
	@ManyToMany(mappedBy = "cars")
	List<Feature> features;

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getCarprice() {
		return carprice;
	}

	public void setCarprice(double carprice) {
		this.carprice = carprice;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
}
