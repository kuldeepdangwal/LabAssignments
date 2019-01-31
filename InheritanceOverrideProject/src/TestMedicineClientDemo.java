import java.util.Scanner;

public class TestMedicineClientDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.println("\nEnter the name of medicine");
			String medName=sc.next();
			System.out.println("Enter the Price of medicine");
			double medPrice=sc.nextDouble();
			System.out.println("Enter the Company of medicine");
			String medComp=sc.next();
			System.out.print("Enter the mg of medicine");
			String mg=sc.next();
			
			Tablet tab=new Tablet();
			tab.setMedName(medName);
			tab.setMedPrice(medPrice);
			tab.setCompName(medComp);
			tab.setmg(mg);
			
			System.out.print(tab.dispMedInfo());
			
			Medicine med=new Medicine();
			Syrup syr=new Syrup();
			Ointment oint=new Ointment();
	}
}
