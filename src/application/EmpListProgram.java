package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class EmpListProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many emplooyees will be registered: ");
		int n = sc.nextInt();
				
		List<Employees> empList = new ArrayList<Employees>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("%nEmployee #" + (i+1) + ":%n");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			empList.add(new Employees(id, name, salary));
		}
			
		String answer;
		do {
			System.out.printf("%nEnter the employee id that will have salary increase: ");
			int idSalInc = sc.nextInt();
			
			if (checkId(empList, idSalInc) == true) {
				for (Employees emp : empList) {

					if (emp.getId() == idSalInc) {
						System.out.print("Enter the percentage: ");
						double percent = sc.nextDouble();
						emp.InscreaseSalary(percent);
					}
				}
			}

			else {
				System.out.printf("%nThis id does not exist.%n");
			} 
		
			System.out.printf("%nThere's more salaries to increase (y/n)? ");
			sc.nextLine();
			answer = sc.nextLine();
			
		} while (answer.equals("y"));
		
		System.out.printf("%nList of employees:%n");
		for (Employees emp : empList) {
			System.out.println(emp);
		}
		
		sc.close();	
	}
	
	public static boolean checkId(List<Employees> empList, int idSal) {
		for (Employees emp : empList) {
			if (emp.getId() == idSal) {
				return true;	
			}
		}
		return false;
	}
}