package oop.com;

public class Main {

	public static void main(String[] args) {
		String[] employee = {"Doung","Chan","Minea","Mesa","Romdoul","Veha","Por","Kanika"};
		int[] salary = { 560, 560, 500, 500, 190, 190, 560,700};
		
		
		int higher_salary = 0;
		String person_higher_salary = "";
		
		int lowest_salary = 0;
		String person_lowest_salary = "";
		
		for (int i = 0; i < salary.length; i++) {
			if(salary[i] > salary[0]) {
				higher_salary = salary[i];
				person_higher_salary = employee[i];
			};
			if(salary[i] < salary[0]) {
				lowest_salary = salary[i];
				person_lowest_salary = employee[i];
			}
		}
		///////////_______1________/////////////
		System.out.println("1.Employee who has highest salary:");
		System.out.println(person_higher_salary + " has the highest salary of " + higher_salary+"$");
		System.out.println(".....................................");
		//////////________2_______/////////////
		System.out.println("2.Employee who has lowest salary:");
		System.out.println(person_lowest_salary + " has the lowest salary of " + lowest_salary);
		System.out.println(".................................");
		
		
		//////////________3_______/////////////
		int average = 0;
		int total = 0;
		int counter=0;
		for (int y = 0; y < salary.length; y++) {
			total += salary[y];
			counter++;
		}
		average = total/counter;
		System.out.println("3.Employee who has lower salary than average: 470.0");
		for (int z = 0; z < salary.length; z++) {
			if(salary[z] < average) {
				System.out.println(employee[z] +": "+ salary[z]+"$");
			};
		}
		System.out.println(".................................");
		
		/////////////__________4__________////////////////
		System.out.println("4.Employee who has higher salary than average: 470.0");
		for (int w = 0; w < salary.length; w++) {
			if(salary[w] > average) {
				System.out.println(employee[w] +": "+ salary[w]+"$");
			}
		}
		System.out.println(".................................");
		
		/////////////___________5______________/////////////
		
	}
		
}
