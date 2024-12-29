package jdbc;

import java.util.Scanner;

//import com.dao.EmployeeDAOImpl;
//import com.dto.Employee;
//import com.dto.Employee;

public class DaoDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		EmployeeDAOImpl emplDAOImpl = new EmployeeDAOImpl();
		
//		--------------------To get Details of All Employees-----------------------------------------
//		List<Employee> employees = emplDAOImpl.getEmployee();
//		for (Employee e : employees) {
//			System.out.println(e.getId() + " " + e.getName() + " " + e.getDesignation() + " " + e.getSalary());
//		}

//		-------------------To Fetch a Employee Data based on Id-------------------------------------
//		System.out.println("Enter employee Id to Fetch Data: ");
//		int id = sc.nextInt();
//		Employee e = emplDAOImpl.getEmployee(id);
//		System.out.println(e.getId() + " " + e.getName() + " " + e.getDesignation() + " " + e.getSalary());

//		--------------------To Updated a Employee Salary---------------------------------------------		
//		System.out.println("Enter the Salary to be Updated: ");
//		int newSalary = sc.nextInt();
//		Employee e = emplDAOImpl.getEmployee(id);
//		e.setSalary(newSalary);
//		System.out.println(emplDAOImpl.updateEmployeeSalary(e));

		sc.close();
	}

}
