import java.util.Arrays;
import java.util.Scanner;
	public class array01 
  {
		public static void main (String args[]) {
			Scanner in=new Scanner(System.in);
		    System.out.print("Enter :");
    	    int []a =new int[9];
		    String s1 = in.next();
				      
    	    for (int i = 0; i < s1.length(); i++) {
			a[i]=Character.getNumericValue((s1.charAt(i)));
	   		System.out.print(Arrays.toString(a));
	        }
  }
}