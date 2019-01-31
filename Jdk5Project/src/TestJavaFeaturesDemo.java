import static java.lang.Math.*;
class Calculator 
{
	public int add(int ...nums)
	{
		int sum=0;
		for(int j=0;j<nums.length;j++)
		sum+=nums[j];
		return sum;
	}
}

public class TestJavaFeaturesDemo
{
	public static void main(String args[])
	{
		Calculator cc=new Calculator();
		System.out.println("Summation is :"+cc.add(90,80));
		System.out.println("Summation is :"+cc.add(90,80,40,50,60,60));
		System.out.println("PI VALUE :"+Math.PI);
		System.out.println("Sqrt VALUE :"+sqrt(4) );
		
		System.out.println("*******enhance for loop");
		int nums[]=new int[4];
		nums[0]=90;
		nums[1]=45;
		nums[2]=23;
		nums[3]=89;
		
		for(int temp:nums)
		{
			System.out.println(" "+temp);
		}
		
		
	}
}
