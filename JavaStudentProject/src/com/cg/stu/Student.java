package com.cg.stu;
import com.cg.bat.Batch;
public class Student 
{
	private int rollNo;
	private String studentName;
	private Batch stuBatch;
	
	Student()
	{
		
	}
	public Student(int rollNo, String studentName, Batch stuBatch) 
	{
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.stuBatch = stuBatch;
	}
	public String dispStuInfo()
	{
		return "Student [rollNo="+rollNo+" ,studentName="+studentName+" ,stuBatch Info="+
				stuBatch.getBatchCode()+" ,"+
				stuBatch.getBatchTime()+" ,"+
				stuBatch.getFacultyName()+" ,"+
				stuBatch.getBatchName()+"] ";
	}
	
	
}
