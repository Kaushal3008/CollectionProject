package Beans;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
	
	private int id;
	private String name;
	private String salary;
	private String department;
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+"\t"+name+"\t"+salary+"\t"+department+"\t\t"+designation;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public EmployeeBean(int id, String name, String salary, String department, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
	}
	public EmployeeBean(String name2, Object object, String department2, String designation2) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
	}
	

	

}
