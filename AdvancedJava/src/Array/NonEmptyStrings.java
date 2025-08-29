package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class NonEmptyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> strings = Arrays.asList("abc"," ","bc","efg","abcd"," ","jkl");	
     
     List<String> nonEmptyStrings = strings.stream()
    		 .filter(s-> s != null && !s.trim().isEmpty())
    		 .collect(Collectors.toList());
     
     System.out.println("Non-Empty Strings: " + nonEmptyStrings);
    		 
    		 
	}

}
