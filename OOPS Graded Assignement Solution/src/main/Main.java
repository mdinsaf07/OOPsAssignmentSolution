package main;

import classes.AdminDepartment;
import classes.HrDepartment;
import classes.TechDepartment;

public class Main {

	public static void main(String[] args) {
    
        AdminDepartment AdminDeptData = new AdminDepartment();
        AdminDeptData.AdminDeptData();
     
	   HrDepartment HrDeptData = new HrDepartment();
	   HrDeptData.HrDeptData();
	   
	   TechDepartment TechDeptData = new TechDepartment();
	   TechDeptData.TechDeptData();
	}
	 
	   
}