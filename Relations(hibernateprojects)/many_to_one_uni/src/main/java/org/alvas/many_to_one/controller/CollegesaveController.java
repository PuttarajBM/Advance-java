package org.alvas.many_to_one.controller;

import org.alvas.many_to_one.dao.Collegedao;
import org.alvas.many_to_one.dto.Building;
import org.alvas.many_to_one.dto.College;

public class CollegesaveController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collegedao collegedao = new Collegedao();
		College college= new College();
		college.setCollegename("jail-institute of engineering and techonology");
		college.setCollegeaddress("Mijar-55554");
		
		Building building = new Building();
		Building building2 = new Building();
		building.setBuildingName("CSE");
		building.setBuildingcolor("blue");
		building.setCollege(college);
		
		building2.setBuildingName("ECE");
		building2.setBuildingcolor("white");
		building2.setCollege(college);
		
		collegedao.saveBuildingCollege(college, building, building2);
		
	}

}
