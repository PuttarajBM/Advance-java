package org.alvas.many_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Building {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int buildingid;
	private String buildingName;
	private String buildingcolor;
	@ManyToOne
	private College college;
	public int getBuildingid() {
		return buildingid;
	}
	public void setBuildingid(int buildingid) {
		this.buildingid = buildingid;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getBuildingcolor() {
		return buildingcolor;
	}
	public void setBuildingcolor(String buildingcolor) {
		this.buildingcolor = buildingcolor;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
}
