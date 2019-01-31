package com.cg.eis.exception;


class MyExceptions extends Exception
{
	
}
public class EmployeeException 
{
	public int checkException(double salary)
	{
			if(salary<3000)
			{
				try
			       { 
			           throw new MyExceptions(); 
			       } 
			       catch (MyExceptions ex) 
			       { 
			           System.out.println("Exception Caught-Salary less than 3000"); 
			       } 
				return 1;
					
			}
			else
			{
				return 0;
			}
			
	}
}
