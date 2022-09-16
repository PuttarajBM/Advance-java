package org.alvas.one_to_one_bi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panid;
	private String panNumber;
	private String panaddress;
	@OneToOne
	@JoinColumn(name="personid")
	Person person;
	
	public int getPanid() {
		return panid;
	}
	public void setPanid(int panid) {
		this.panid = panid;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getPanaddress() {
		return panaddress;
	}
	public void setPanaddress(String panaddress) {
		this.panaddress = panaddress;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
