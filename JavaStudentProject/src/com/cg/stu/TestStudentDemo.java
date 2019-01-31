package com.cg.stu;

import com.cg.bat.Batch;

public class TestStudentDemo 
{
	public static void main(String[] args) 
	{
		Batch javaBat=new Batch();
		javaBat.setBatchCode("JEE001");
		javaBat.setBatchName("JAVA FULL STACK 16th jan");
		javaBat.setFacultyName("TECHR NAME");
		javaBat.setBatchTime("8:30 to 6pm");
		
		Batch dotnet=new Batch();
		dotnet.setBatchCode("JEE002");
		dotnet.setBatchName("DOTNET 76th jan");
		dotnet.setFacultyName("TECHR NAME");
		dotnet.setBatchTime("8:30 to 6pm");
		
		Student javaStu1=new Student(444,"Nitish",javaBat);
		Student javaStu2=new Student(666,"Sandeep",javaBat);
		Student javaStu3=new Student(888,"Patit",dotnet);
		System.out.println(javaStu1.dispStuInfo());
		System.out.println(javaStu2.dispStuInfo());
		System.out.println(javaStu3.dispStuInfo());
		
		
		

	}

}
