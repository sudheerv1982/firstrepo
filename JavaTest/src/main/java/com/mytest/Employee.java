/**
 * 
 */
package com.mytest;

/**
 * @author Sudheer Vedanaparthi
 *
 */
public abstract class Employee {
	protected int empno;
	protected String empName;
	protected int salary;
	
	public abstract void findEmployee(int empNo);
	
	public String getDepartment(int empNo) {
		return "IT";
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee() {}

	public Employee(int pEmpNo, String pEmpName, int pSalary) {
		this.empno = pEmpNo;
		this.empName = pEmpName;
		this.salary = pSalary;
	}
}
