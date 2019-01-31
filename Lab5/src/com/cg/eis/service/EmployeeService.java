package com.cg.eis.service;

interface EmployeeService
{
	void findEmpIns(double salary,String designation);
	double findEmpTax(double salary);
	int findEmpAge(int empId);
};
