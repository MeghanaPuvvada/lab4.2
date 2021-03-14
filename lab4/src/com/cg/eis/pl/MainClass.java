package com.cg.eis.pl;
import com.cg.eis.service.*;
public class MainClass {

	public static void main(String args[]) {
		Service emp=new Service();
		emp.getEmployDetails();
		emp.InsuranceType();
		emp.Display();

	}
}
