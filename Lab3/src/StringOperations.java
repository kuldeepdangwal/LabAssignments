import java.util.Scanner;

public class StringOperations 
{
		public String additself(String str1)
		{
				String newstr1;
				newstr1=str1+str1;
				return newstr1;
		}
				
		public String replaceodd(String str1)
		{
				int i;
				char[] strchar1=str1.toCharArray();
				for(i=0;i<strchar1.length;i=i+2)
				{
					strchar1[i]='#';
				}
				String newstr2=new String(strchar1);
				return newstr2;
		}
				
		public String removeduplicates(String str1)
		{
			int i,j,k,temp;
				char[] strchar2=str1.toCharArray();
				int length=strchar2.length;
				for(i=0;i<length;i++)
				{
					for(j=i+1;j<length;j++)
					{
						if(strchar2[i]==strchar2[j])
						{
							temp=j;
							
							for(k=temp;k<length-1;k++)
							{
								strchar2[k]=strchar2[k+1];
							}
							
							j--;
							length--;
						}
					}
				}
				String newstr3=new String(strchar2);
				newstr3=newstr3.substring(0, length);
				return newstr3;
		}
		public String odduppercase(String str1)
		{
				int i;
				char[] strchar3=str1.toCharArray();
				for(i=0;i<strchar3.length;i=i+2)
				{
					strchar3[i]=Character.toUpperCase(strchar3[i]);
				}
				String newstr4=new String(strchar3);
				return newstr4;
				
		}
		
		
	}

