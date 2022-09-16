package org.alvas.hibernate_customer_crud.controller;

import java.util.Scanner;

import org.alvas.hibernate_customer_crud_dao.CustomerDao;
import org.alvas.hibernate_customer_crud_dto.Customer;

public class CustomerController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer customer = null;
		CustomerDao customerDao = new CustomerDao();
		while (true) {
			System.out.println("1.SaveCustomer");
			System.out.println("2.updtae the Cutsomer");
			System.out.println("3.delete the customer");
			System.out.println("4.Display the all the details");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				customer = new Customer();
				System.out.println("Enter the customerName ");
				customer.setName(sc.next());
				System.out.println("Enter the  customeremail");
				customer.setEmail(sc.next());
				customerDao.saveCustomer(customer);
			}
				break;
			case 2: {

				System.out.println("Enter the customer id");
				int id = sc.nextInt();
				System.out.println("Enter the Customer Name");
				String name = sc.next();
				System.out.println("Enter the Customer mail");
				String mail = sc.next();
				Customer customer1 = customerDao.updateById(id, name, mail);
				System.out.println(customer1.getId() + " " + customer1.getName() + " " + customer1.getEmail());

			}
				break;

			case 3: {
				System.out.println("Enter the customer id");
				int id = sc.nextInt();
				Customer customer2 = customerDao.deleteById(id);
				System.out.println(customer2.getId() + " " + customer2.getName());

			}
				break;

			case 4: {
				Customer customer1 = customerDao.displayAll(customer);
				System.out.println(customer1.getId() + "" + customer1.getName() + "" + customer1.getEmail());
			}
				break;
			case 5:System.exit(0);
			break;
			}
		}
	}

}
