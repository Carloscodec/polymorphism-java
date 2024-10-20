package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n): ");
			char answer = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Hours: ");
			int hours = input.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();
			if (answer == 'y') {
				System.out.print("Additional Charger: ");
				double additionalCharger = input.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharger));
			}
			else list.add(new Employee(name, hours, valuePerHour));
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		input.close();

	}

}
