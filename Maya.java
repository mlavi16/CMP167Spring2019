package firstpackage;

/*
 * Author: Maya Lavi
 * Date: 2.19.19 week 4
 * Description: StringOutputStream Demo
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;



public class Maya {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    StringWriter fullnameSW = new StringWriter();
	    PrintWriter fullnamePW = new PrintWriter(fullnameSW);
	    
	    System.out.println("Please enter: \"firstname lastname\"");
	    String word1 = input.next();
	    String word2 = input.next();
	    
	    fullnamePW.print(word1 + " , " + word2);
	    
	    String fullname = fullnameSW.toString();
	    
	    System.out.println(fullname);
		
		
	}

}
