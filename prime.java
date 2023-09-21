import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class prime {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n,count =0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		System.out.println("Enter the number : ");
		n = Integer.parseInt(br.readLine());
		
		if(n == 0 || n==1){
			System.out.println(n+ " is NOT a prime number");
			return;
		}
		
		for(int i = 2;i<=n/2;i++){
			if(n%i == 0){
				count++;
			}
		}
		
		if(count == 0){
			System.out.println(n+ " is a prime number");
		} else{
			System.out.println(n+ " is NOT a prime number!");
		}
	}

}
