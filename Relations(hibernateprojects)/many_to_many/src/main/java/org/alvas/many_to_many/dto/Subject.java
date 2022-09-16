package org.alvas.many_to_many.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Subjectid;
	private String SubjectName;
	private String SubjectAuthor;

	public int getSubjectid() {
		return Subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.Subjectid = subjectid;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		this.SubjectName = subjectName;
	}

	public String getSubjectAuthor() {
		return SubjectAuthor;
	}

	public void setSubjectAuthor(String subjectAuthor) {
		this.SubjectAuthor = subjectAuthor;
	}

}
