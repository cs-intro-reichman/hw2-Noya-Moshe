// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		double sum = 0.0; 
        int sign = 1;
		int denominator = 1;

		for (int i = 0; i < num; i++){
			sum = sum + sign*(1.0 / denominator);
			denominator += 2;
			sign *= -1;
		}
			System.out.println("pi according to Java: " + Math.PI);
		    System.out.println("pi, approximated:     " + sum * 4);
	
	}
}

