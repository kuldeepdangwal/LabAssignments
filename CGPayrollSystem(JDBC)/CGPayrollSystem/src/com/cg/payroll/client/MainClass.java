package com.cg.payroll.client;

import java.util.Scanner;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exception.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {
	public static void main(String[] args) throws AssociateDetailNotfoundException{
		PayrollServices services = new PayrollServicesImpl();
		int switchKey;
		Scanner sc = new Scanner(System.in);
		int flag=1;
		int associateId ;
		while(flag==1) {
		System.out.println("PLEASE CHOSE AN OPTION");
		System.out.println("1. ADD AN ASSOCIATE");
		System.out.println("2. GET NET SALARY OF EMPLOYEE");
		System.out.println("3. GET ASSOCIATE DETAILS");
		System.out.println("4. GET ALL ASSOCIATES");
		System.out.println("5. EXIT");
		switchKey = sc.nextInt();
		switch(switchKey) {
		case 1 : System.out.println("******ADDING ASSOCIATE*****"); 
				 int associateId1 = services.acceptAssociateDetails("Nitish3", "agarwal3", "emailId5", "department3", "designation3", "pancard3", 300, 300	, 300, 300,100, "bankName3", "ifscCode3");
				 System.out.println("Associate created with id" + associateId1);
				 int associateId2 = services.acceptAssociateDetails("Nitish4", "agarwal4", "emailId6", "department4", "designation4", "pancard4", 400, 400	, 400, 400,400, "bankName4", "ifscCode4");
				 System.out.println("Associate created with id" + associateId2);
				 break;
		
		case 2 : System.out.println("********GET NET SALARY*********");
				 System.out.println("enter associate id");
				 associateId  = sc.nextInt();
				 int netSalary = services.calculateNetSalary(associateId);
				 System.out.println("Net salary is :" + netSalary);
				 break;
		
		case 3 : System.out.println("*****GET ASSOCIATE DETAILS*****");
				 System.out.println("enter associate id");
				 associateId  = sc.nextInt();
				 System.out.println(services.getAssociateDetails(associateId).toString());
				 break;

		case 4 : System.out.println(services.getAllAssociatesDetails());
				 break;
				 
		case 5 : flag=0;
				 break;
				 
		default : System.out.println("Wrong option ");
				 break;
		
		}
		
		}
		
	}
}
