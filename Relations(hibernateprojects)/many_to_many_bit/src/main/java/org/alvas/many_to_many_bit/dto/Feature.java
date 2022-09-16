package org.alvas.many_to_many_bit.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Feature {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int featureid;
	@CreationTimestamp
	private LocalDateTime dateTime;
	private String featurename;
	@ManyToMany
	@JoinTable(name = "cars_and_features",
	joinColumns = @JoinColumn
	List<Car> Cars;

	public int getFeatureid() {
		return featureid;
	}

	public void setFeatureid(int featureid) {
		this.featureid = featureid;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getFeaturename() {
		return featurename;
	}

	public void setFeaturename(String featurename) {
		this.featurename = featurename;
	}

	public List<Car> getCars() {
		return Cars;
	}

	public void setCars(List<Car> cars) {
		Cars = cars;
	}

}
