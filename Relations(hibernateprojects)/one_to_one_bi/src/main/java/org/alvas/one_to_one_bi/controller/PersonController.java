package org.alvas.one_to_one_bi.controller;

import org.alvas.one_to_one_bi.dao.Persondao;
import org.alvas.one_to_one_bi.dto.Pen;
import org.alvas.one_to_one_bi.dto.Person;

public class PersonController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persondao persondao= new Persondao();
		Person person=new Person();
		Pen pan = new Pen();
		pan.setPanNumber("qweryy");
		pan.setPanaddress("lappok");
		
		person.setPersonname("prasanna");
		person.setPersonemail("prasanna@gmail.com");
		pan.setPerson(person);
		
		persondao.saveperson(person, pan);
		}

}
