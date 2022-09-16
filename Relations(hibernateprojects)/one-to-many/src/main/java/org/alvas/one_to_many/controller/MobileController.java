package org.alvas.one_to_many.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.alvas.one_to_many.dao.MobileDao;
import org.alvas.one_to_many.dto.Mobile;
import org.alvas.one_to_many.dto.Sim;

public class MobileController {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		while (true) {
			System.out.println("1) savemobilesim");
			System.out.println("2) updatemobilesim");
			System.out.println("3) deletethedetails");
			System.out.println("Enter the choice");
			
			Mobile mobile = new Mobile();
			MobileDao dao = new MobileDao();
			switch (choice) {
			case 1: {

				Sim sim1 = new Sim();
				Sim sim2 = new Sim();
				sim1.setName("JIO");
				sim2.setProvider("idea");
				List<Sim> sim = Arrays.asList(sim1, sim2);
				mobile.setName("redmi");
				mobile.setModel("10process");
				mobile.setList(sim);
				dao.saveMobileSim(mobile, sim);
				System.out.println("*****");
			}
				break;
			case 2: {
				int id = 1;
				String simname = "tat-docomo";
				String mobilename = "sony";
				dao.updateMobileById(id, simname, mobilename);
			}break;
			
			}
		}
	}
}
