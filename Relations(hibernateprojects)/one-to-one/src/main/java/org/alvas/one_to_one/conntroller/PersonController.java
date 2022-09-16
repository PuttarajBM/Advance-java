package org.alvas.one_to_one.conntroller;

import java.util.Scanner;

import org.alvas.one_to_one.dao.PersonDao;
import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;

public class PersonController {
	static Person person = new Person();
	static Adhar adhar = new Adhar();
	static PersonDao dao = new PersonDao();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.SavePersonAndadhar");
			System.out.println("2.getAlldetails");
			System.out.println("3.Delete the details");
			System.out.println("4.Upate the details");
			System.out.println("Choose your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the number");
				int num = sc.nextInt();
				System.out.println("enter the address");
				String add = sc.next();
				
				System.out.print("Enter the name");
				String name = sc.next();
				System.out.println("Enter the mail id");
				String mail = sc.next();

				adhar.setAdharnum(num);
				adhar.setAddress(add);

				person.setName(name);
				person.setEmail(mail);
				person.setAdhar(adhar);
				dao.savePerson(person, adhar);
			}
			break;
			case 2:{
				System.out.println("Enter the id");
				int i = sc.nextInt();
				Person person=dao.getPersonAdhar(i);
				System.out.println("person details");
				System.out.println(person.getId()+" "+person.getEmail()+" "+person.getName());
				System.out.println("Adhardetails");
				System.out.println(person.getAdhar().getId());
				System.out.println(person.getAdhar().getAdharnum());
				System.out.println(person.getAdhar().getAddress());
				
				
			}break;
			
			case 3:
			{
				System.out.println("Enter the id");
				int i = sc.nextInt();
				Person person=dao.deletebyID(i);
			}
			break;
			case 4:{
				System.out.println("Enter the id");
				int id = sc.nextInt();
				System.out.println("enter the name");
				String name=sc.next();
				System.out.println("enter the adhar number");
				long ad=sc.nextLong();
				dao.UpdatebyId(id, name, ad);
			}
			}

		}

	}

}
