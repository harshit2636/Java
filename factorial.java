import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class factorial {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n,fact =1;
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. :");
		n =Integer.parseInt( br.readLine());
		
		for(int i=1;i<=n;i++){
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+ n+" is "+ fact);

	}

}
