
//Name: Subrat Sahu
// Batch: B2
// PRN: 2020016400833692
// Date: 13th August 2021
// Prac-05: Threads

import java.io.*;
import java.util.*;
public class P5_Q2_Primes_SS {
	public static void main(String args[]){
		try{
			P5_Q2_PrimeThread_SS pt = null;
			System.out.print("Enter a number> ");
			Scanner scan = new Scanner(System.in);
			int limit = scan.nextInt();
			System.out.print("Enter a file name to store the results>");
			String fName = scan.next();
		if(fName.length()>0)
			pt = new P5_Q2_PrimeThread_SS(limit, new FileOutputStream(fName));
		else
			pt = new P5_Q2_PrimeThread_SS(limit);
		pt.run();
	}catch(Exception e){
		e.printStackTrace();
	}
    }//main ends
}//class ends
