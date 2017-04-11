package com.mytest;

public class SubClass extends Employee {
	
	public SubClass(int empno, String name, int salary) {
		super(empno, name, salary);
	}
	

	@Override
	public void findEmployee(int empNo) {
		System.out.println(empno + "\n" + empName + "\n" + salary);
	}

}
