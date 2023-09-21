import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class sum {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n1,n2,sum;
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of number 1: ");
		n1 =Integer.parseInt( br.readLine());
		System.out.println("Enter the value of number 2: ");
		n2 =Integer.parseInt( br.readLine());
		sum = n1 + n2;
		System.out.println("Sum of numbers is : "+ sum);

	}

}
