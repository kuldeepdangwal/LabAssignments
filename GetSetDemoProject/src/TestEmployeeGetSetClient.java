
public class TestEmployeeGetSetClient {
	public static void main(String args[])
	{
		Employee emp1=new Employee();
		emp1.setEmpId(01);
		emp1.setEmpName("nitish");
		emp1.setEmpSalary(1000);
		emp1.setGender('M');
		
		Employee emp2=new Employee();
		emp2.setEmpId(02);
		emp2.setEmpName("sandepe");
		emp2.setEmpSalary(2000);
		emp2.setGender('F');
		
		System.out.println("Employee Emp1 Details :\nEMPID :"+emp1.getEmpId()+"\nEMP NAME :"
															 +emp1.getEmpName()+"\nEMP SALARY :"
															 +emp1.getEmpSalary()+"\nEMP GENDER :"
															 +emp1.getGender());

		System.out.println("Employee Emp2 Details :\nEMPID :"+emp2.getEmpId()+"\nEMP NAME :"
															 +emp2.getEmpName()+"\nEMP SALARY :"
				 											 +emp2.getEmpSalary()+"\nEMP GENDER :"
				 											 +emp2.getGender());
			
		
	}

}
