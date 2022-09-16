package org.alvas.many_to_many.controller;

import java.util.Arrays;
import java.util.List;

import javax.security.auth.Subject;

import org.alvas.many_to_many.dao.Studentdao;
import org.alvas.many_to_many.dto.Student;

public class StudentSavecontroller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();
		Student student = new Student();

		Subject subject1 = new Subject();
		Student student1 = new Student();
		Studentdao studentdao = new Studentdao();

//		setsubjectvalue
		subject.setSubjectName("computer-organization");
		subject.setSubjectAuthor("james-grill");

		subject1.s("c-language");
		subject1.setSubjectAuthor("danies-richard");

		List<Subject> subjects = Arrays.asList(subject, subject1);

		student.setStudentName("abhishek");
		student.setStudentPhone(8787822);
		student.setSubjects(subject);

		student1.setStudentName("puttaraj");
		student1.setStudentPhone(8942555);
		student1.setSubjects(subject1);

		studentdao.savestudent(student, student1, subjects);

	}

}
