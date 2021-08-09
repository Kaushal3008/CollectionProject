package Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Beans.EmployeeBean;

public class Employee {

	List<EmployeeBean> list = new ArrayList<EmployeeBean>();
	Scanner sc = new Scanner(System.in);
	InputANDOutputStream inout=new InputANDOutputStream();
	List<EmployeeBean> list1=inout.inputStearm();

	public void insertEmp() {

		System.out.println("enter id:");
		int id = sc.nextInt();
		System.out.println("enter name:");
		String name = sc.next();
		System.out.println("enter salary:");
		String salary = sc.next();
		System.out.println("enter department:");
		String dept = sc.next();
		System.out.println("enter designation:");
		String desig = sc.next();

		EmployeeBean emp = new EmployeeBean(id, name, salary, dept, desig);
		list= inout.inputStearm();
		list.add(emp);
		inout.outputStearm(list);
		
	}

	public void getAllRecord() {
	
		Iterator<EmployeeBean> i = list.iterator();
		System.out.println("--*----*----*----*----*----*----*----*----*----");
		System.out.println("ID\tName\tSalary\tdepartment\tdesignation");
		System.out.println("--------------------------------------------------");
		
		while (i.hasNext()) {
			EmployeeBean b = i.next();
			System.out.println(b);
			System.out.println("-----------------------------------------------");

		}
		System.out.println("----*----*----*----*----*----*----*----*----*----");
	}
	
	public void getAll() {
		List<EmployeeBean> oo= inout.inputStearm();
		System.out.println("ID\tName\tSalary\tdepartment\tdesignation");
		System.out.println("--------------------------------------------------");
		for (EmployeeBean employeeBean : oo) {
		System.out.println(employeeBean.getId()+"\t"+employeeBean.getName()+"\t"+employeeBean.getSalary()+"\t"+employeeBean.getDepartment()+"\t\t"+employeeBean.getDesignation());
		System.out.println("--------------------------------------------------");
		}
	}

	public boolean serchById() {

		System.out.println("Enter ID which you want to search");
		int id = sc.nextInt();
		Iterator<EmployeeBean> i = list.iterator();
		System.out.println("--*----*----*----*----*----*----*----*----*----");
		System.out.println("ID\tName\tSalary\tdepartment\tdesignation");
		System.out.println("--------------------------------------------------");
		while (i.hasNext()) {
			EmployeeBean employeeBean = (EmployeeBean) i.next();
			if (employeeBean.getId() == id) {
				System.out.println("record exist");
				System.out.println(employeeBean);
				return true;
			} else {
				System.out.println("record doesn't exist");
			}
		}
		return false;
	}

	public boolean serchById1() {

		System.out.println("Enter ID which you want to search");
		int id = sc.nextInt();
		//List<EmployeeBean> list1=inout.inputStearm();
		Iterator<EmployeeBean> i = list.iterator();
		System.out.println("--*----*----*----*----*----*----*----*----*----");
		System.out.println("ID\tName\tSalary\tdepartment\tdesignation");
		System.out.println("--------------------------------------------------");
		while (i.hasNext()) {
			for (EmployeeBean employeeBean2 : list) {
			
				if (employeeBean2.getId() == id) {
					System.out.println(employeeBean2);
					System.out.println("--------------------------------------------------");
					return true;
				} else {
					System.out.println("record doesn't exist");
				}
				
			}
			
		}
		return false;
	}
	
	public boolean serchByName() {
		boolean found=false;
		
		System.out.println("Enter name which you want to search");
		String name = sc.next();
		Iterator<EmployeeBean> i = list.iterator();
		while (i.hasNext()) {
			EmployeeBean employeeBean =i.next();
			if (employeeBean.getName().equals(name)) {
				//System.out.println("record exist");
				System.out.println(employeeBean);
				found=true;
			} 
			if(!found) {
				System.out.println("Not found");
			}
		
		}
		return found;
	}

	public boolean serchByName1() {
		boolean found=false;
		
		System.out.println("Enter name which you want to search");
		String name = sc.next();
		
		Iterator<EmployeeBean> i = list.iterator();
		while (i.hasNext()) {
			//EmployeeBean employeeBean =i.next();
			for (EmployeeBean employeeBean : list) {
				if (employeeBean.getName().equalsIgnoreCase(name)) {
					//System.out.println("record exist");
					System.out.println(employeeBean);
					return true;
				} 
				if(!found) {
					System.out.println("Not found");
					return false;
				}	
			}
		}
		return found;
	}

	public void sortedByName() {

		List<EmployeeBean> list2=inout.inputStearm();
		Collections.sort(list2, new Comparator<EmployeeBean>() {
			public int compare(EmployeeBean e1, EmployeeBean e2) {
				return String.valueOf(e1.getName()).compareTo(e2.getName());
			}
		});
		System.out.println("--*----*----*----*----*----*----*----*----*----");
		System.out.println("ID\tName\tSalary\tdepartment\tdesignation");
		
		 
		for (int i = 0; i < list2.size(); i++) {
			
			System.out.println(list2.get(i).getId()+"\t" + list2.get(i).getName() + "\t" + list2.get(i).getSalary() + "\t"
					+ list2.get(i).getDepartment() + "\t\t" + list2.get(i).getDesignation());
			System.out.println("--------------------------------------------------");
		}

	}

	public void sortedBySalary() {
		List<EmployeeBean> list2=inout.inputStearm();
		Collections.sort(list2, new Comparator<EmployeeBean>() {
			public int compare(EmployeeBean e1, EmployeeBean e2) {
				return String.valueOf(e1.getSalary()).compareTo(e2.getSalary());
			}
		});
		System.out.println("--*----*----*----*----*----*----*----*----*----");
		System.out.println("ID\tName\tSalary\tdepartment\tdesignation");
		
		for (int i = 0; i < list2.size(); i++) {
		
			System.out.println(list2.get(i).getId()+"\t" + list2.get(i).getName() + "\t" + list2.get(i).getSalary() + "\t"
					+ list2.get(i).getDepartment() + "\t\t" + list2.get(i).getDesignation());
			System.out.println("--------------------------------------------------");
		}

	}

	public void sortedByDepartment() {
		List<EmployeeBean> list2=inout.inputStearm();
		Collections.sort(list2, new Comparator<EmployeeBean>() {
			public int compare(EmployeeBean e1, EmployeeBean e2) {
				return String.valueOf(e1.getDepartment()).compareTo(e2.getDepartment());
			}
		});
		System.out.println("--*----*----*----*----*----*----*----*----*----");
		System.out.println("ID\tName\tSalary\tdepartment\tdesignation");
		for (int i = 0; i < list2.size(); i++) {
			
			System.out.println(list2.get(i).getId()+"\t" + list2.get(i).getName() + "\t" + list2.get(i).getSalary() + "\t"
					+ list2.get(i).getDepartment() + "\t\t" + list2.get(i).getDesignation());
			System.out.println("--------------------------------------------------");
		}

	}

	public void sortedBydesignation() {
		
		List<EmployeeBean> list2=inout.inputStearm();
		Collections.sort(list2, new Comparator<EmployeeBean>() {
			public int compare(EmployeeBean e1, EmployeeBean e2) {
				return String.valueOf(e1.getDesignation()).compareTo(e2.getDesignation());
			}
		});
		System.out.println("--*----*----*----*----*----*----*----*----*----");
		System.out.println("ID\tName\tSalary\tdepartment\tdesignation");
		for (int i = 0; i < list2.size(); i++) {
			
			
			System.out.println(list2.get(i).getId()+"\t" + list2.get(i).getName() + "\t" + list2.get(i).getSalary() + "\t"
					+ list2.get(i).getDepartment() + "\t\t" + list2.get(i).getDesignation());
			System.out.println("--------------------------------------------------");
		}

	}

	public boolean deleteById() {
		boolean found=false;
		List<EmployeeBean> list1=inout.inputStearm();
		System.out.println("Enter ID which you want to delete");
		int id = sc.nextInt();
		Iterator<EmployeeBean> i = list1.iterator();
		while (i.hasNext()) {
			EmployeeBean employeeBean =i.next();
			
				if (employeeBean.getId() == id) {
					i.remove();
					inout.outputStearm(list1);
					System.out.println("deleted successfully");
					return true;
				}
			
			if(!found) {
				System.out.println("Not found");
			}
		}
		return found;

	}

	public boolean deleteByName() {

		System.out.println("Enter Name which you want to delete");
		String name = sc.next();
		Iterator<EmployeeBean> i = list.iterator();
		while (i.hasNext()) {
			EmployeeBean employeeBean = (EmployeeBean) i.next();
			if (employeeBean.getName().equals(name)) {
				i.remove();
				return true;
			} else {
				System.out.println("record doesn't exist");
			}
		}
		return false;

	}
	
	public boolean updateById() {
		boolean found = false;
		System.out.println("Enter Id which you want to Update: ");
		int id = sc.nextInt();
		list1=inout.inputStearm();
		ListIterator<EmployeeBean> itr = list1.listIterator();
		while(itr.hasNext()) {
			EmployeeBean e = itr.next();
			for (EmployeeBean employeeBean : list1) {
				if(employeeBean.getId() == id) {
					System.out.println("Enter new Name:");
					String name = sc.next();
					System.out.println("Enter new Salary:");
					String salary = sc.next();
					System.out.println("Enter new Designation:");
					String designation= sc.next();
					System.out.println("Enter new Department:");
					String department = sc.next();
					
					itr.set(new EmployeeBean(id, name, salary, designation, department));
					inout.outputStearm(list1);
					System.out.println("Records Updated Successfully!");
					return true;
				}
		
			}
			
				}
		if(!found) {
			System.out.println("Record not Found!");
		}
		return found;
	}
	
	public boolean updateByName() {
		boolean found = false;
		System.out.println("Enter name which you want to Update: ");
		String name = sc.next();
		list1=inout.inputStearm();
		ListIterator<EmployeeBean> itr = list1.listIterator();
		while(itr.hasNext()) {
			EmployeeBean e = itr.next();
			for (EmployeeBean e1 : list1) {
				if(e.getName().equals(name)) {
					
					System.out.println("Enter new Name:");
					String name1 = sc.next();
					System.out.println("Enter new Salary:");
					String salary = sc.next();
					System.out.println("Enter new Designation:");
					String designation= sc.next();
					System.out.println("Enter new Department:");
					String department = sc.next();
					
					itr.set(new EmployeeBean(name1, salary, designation, department));
					inout.outputStearm(list1);
					System.out.println("Records Updated Successfully!");
					 return true;
				}
			}
			
		}
		if(!found) {
			System.out.println("Record not Found!");
		}
		return found;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		int input;
		do {
			while (true) {
				System.out.println("1- FOR INSERT");
				System.out.println("2- FOR UPDATE");
				System.out.println("3- FOR DELETE");
				System.out.println("4- FOR SEARCHING");
				System.out.println("5- FOR LIST ALL RECORDS ");
				System.out.println("6- FOR SORTING");
				System.out.println("7- Exit");
				System.out.println("Enter number::");
				input = sc.nextInt();

				switch (input) {
				case 1: {
					emp.insertEmp();
					break;
				}
				case 2: {
					System.out.println("for update");
					System.out.println("1 - update by id");
					System.out.println("2 - update by name");
					int i = sc.nextInt();
					switch (i) {
					case 1: {
						emp.updateById();
						break;

					}
					case 2: {
						emp.updateByName();
						break;

					}
					default:
						System.out.println("invalid input");
					}
					break;
				}
				case 3: {
					System.out.println("for delete");
					System.out.println("1 - delete by id");
					System.out.println("2 - delete by name");
					int i = sc.nextInt();
					switch (i) {
					case 1: {
						emp.deleteById();
						break;

					}
					case 2: {
						emp.deleteByName();
						break;
					}
					default:
						System.out.println("invalid input");
					}

					break;
				}
				case 4: {
					System.out.println("Searching case");

					System.out.println("1-search by id");
					System.out.println("2-search by name");
					int i = sc.nextInt();

					switch (i) {
					case 1: {
						emp.serchById1();
						break;
					}
					case 2: {
						emp.serchByName1();
						break;
					}
					default:
						System.out.println("Invalid input");
						break;
					}
					break;
				}
				case 5: {
					emp.getAll();
					break;
				}
				case 6: {
					System.out.println("Sorting");
					System.out.println("1 - sorting by name");
					System.out.println("2 - sorting by salary");
					System.out.println("3 - sorting by department");
					System.out.println("4 - sorting by designation");
					int ch = sc.nextInt();
					switch (ch) {
					case 1: {
						emp.sortedByName();
						break;

					}
					case 2: {
						emp.sortedBySalary();
						break;
					}
					case 3: {
						emp.sortedByDepartment();
						break;
					}
					case 4: {
						emp.sortedBydesignation();
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + ch);
					}
					break;

				}
				default:
					System.out.println("EXIT");
					break;
				}
			}
		} while (input != 0);
	}

}
