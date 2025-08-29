package Array;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter your birthdate(yyyy-mm-dd): ");
   String input = sc.nextLine();
   
   LocalDate birthDate = LocalDate.parse(input);
   
   LocalDate today = LocalDate.now();

    Period age = Period.between(birthDate, today);
    
    System.out.println("You are " + age.getYears() + "Years, " + age.getMonths() +" months, and " + age.getDays() + " days old.");
	}

}
