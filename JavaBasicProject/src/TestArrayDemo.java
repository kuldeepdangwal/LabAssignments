
public class TestArrayDemo 
{
	public static void main(String args[])
	{
		int marks[]=new int[5];
		marks[0]=90;
		marks[1]=56;
		marks[2]=22;
		marks[3]=78;
		marks[4]=53;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("marks["+i+"]:"+marks[i]);
		}
		
		
		System.out.println("***************2D***************");
		int A[][]=new int[3][2];
		A[0][0]=9;
		A[0][1]=5;
		A[1][0]=2;
		A[1][1]=7;
		A[2][0]=5;
		A[2][1]=3;
		
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("***************STRING***************");
		String cities[]={"Pune","Mumbai","Noida","Delhi"};
		
		
		
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}
		
	}
}
