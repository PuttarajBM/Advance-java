package org.alvas.one_to_one_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int personid;
	private String personname;
	private String personemail;
	@OneToOne(mappedBy = "personid", cascade = CascadeType.PERSIST)
	private Pen pan;

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getPersonemail() {
		return personemail;
	}

	public void setPersonemail(String personemail) {
		this.personemail = personemail;
	}

	public Pen getPan() {
		return pan;
	}

	public void setPan(Pen pan) {
		this.pan = pan;
	}
}
