package org.alvas.many_to_many.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Studentid;
private String StudentName;
private long StudentPhone;
@ManyToMany
List<Subject> subjects;
public int getStudentid() {
	return Studentid;
}
public void setStudentid(int studentid) {
	Studentid = studentid;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public long getStudentPhone() {
	return StudentPhone;
}
public void setStudentPhone(long studentPhone) {
	StudentPhone = studentPhone;
}
public List<Subject> getSubjects() {
	return subjects;
}
public void setSubjects(List<Subject> subjects) {
	this.subjects = subjects;
}


}
