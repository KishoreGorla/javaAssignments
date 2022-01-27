package kishore;


import java.util.Scanner;

class Employee{
	Scanner input = new Scanner(System.in);
	int s = 20000;
	void getTotalSalary() {
		System.out.println("Salary of the employee is: "+ s);
	}
	
}
class Manager extends Employee{
	Scanner input = new Scanner(System.in);
	void getTotalSalary() {
		System.out.print("Enter the incentives: ");
		int i = input.nextInt();
		System.out.println("Total Salary of Manager is"+(super.s+i));
	}
}
class Labour extends Employee{
	Scanner input = new Scanner(System.in);
	void getTotalSalary() {
		System.out.print("Enter the extra time of the labour in month: ");
		int i = input.nextInt();
		//int x = super.s/ 12;
		//int y = x*i;
		System.out.println("Total salary of labour is: "+(super.s+i));
	}
}
public class Hierarchy {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.getTotalSalary();
		Manager m = new Manager();
		m.getTotalSalary();
		Labour l = new Labour();
		l.getTotalSalary();
	}

}
 