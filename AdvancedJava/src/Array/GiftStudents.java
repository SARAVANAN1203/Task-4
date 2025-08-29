package Array;

import java.util.stream.*;
import java.util.*;

public class GiftStudents {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> students = Arrays.asList("Arun","Arjun","Vijay","Kohli","Ajith","Rahul","Saravanan","Anand","Dhoni","Arputhan");
     
     List<String>specialGiftStudents = students.stream()
     .filter(name -> name.startsWith("A"))
     .collect(Collectors.toList());
     
     System.out.println("Students who will receive special gifts: " + specialGiftStudents);
     
	}

}
