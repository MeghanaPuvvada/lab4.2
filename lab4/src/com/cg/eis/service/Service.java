package com.cg.eis.service;

import com.cg.eis.bean.*;
import java.util.*;
public class Service extends Employee implements EmployeeService{
	
	Scanner sc=new Scanner(System.in);
	Employee e=new Employee();
	 public void getEmployDetails() {
		 System.out.println("Enter Details:");
		 System.out.println("Enter id:");e.setId(sc.nextInt());
		 System.out.println("Enter salary:");e.setSalary(sc.nextInt());
		 System.out.println("Enter Designation:");e.setDesignation(sc.next());
		 System.out.println("Enter Name:");e.setName(sc.next()); 
	 }
	 
	 public void InsuranceType() {
			Employee e=new Employee();
			 System.out.println("Insurance Scheme for Employee:");
			 if(e.getSalary()<10000)
				 e.setInsurance("Tier 1");
			 else
				 e.setInsurance("Tier 2");
			System.out.println(e.getInsurance());
	}
	 
	 public void Display() {
		 System.out.println("-----------------------------------------");
		 System.out.println("-----------------------------------------");
		 System.out.println("Details");
		 System.out.println("Name: "+e.getName());
		 System.out.println("Id: "+e.getId());
		 System.out.println("Salary: "+e.getSalary());
		 System.out.println("Desig: "+e.getDesignation());
		 System.out.println("INsSch: "+e.getInsurance());
	 }

	@Override
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		
	}
}
