import java.math.BigInteger;


public class Problem3_largestprimefactor {
	public static void main (String [] args){
		long n = 600851475143L;
		int divisor = 2;
		
		while(n > divisor){
			if(n % divisor == 0){
				n /= divisor;
				divisor = 2;
			}else{
				divisor++;
			}
		}
		System.out.println(divisor);
	}
}
