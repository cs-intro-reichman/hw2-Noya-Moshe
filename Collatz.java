// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int N = Integer.parseInt(args[0]);
		String state = args[1];
		
		for(int seed = 1; seed <= N; seed++){
		  int newNum = seed;
		  int counter = 1;
		  
		  if(state.equals("v")){
			System.out.print(newNum + " ");
		  }
		
		  do { 
			if (newNum % 2 == 0){
				newNum = newNum / 2;
		  } else {
			newNum = (newNum * 3) +1;
		  }
		
		counter++; 
		

		if(state.equals("v")){
			System.out.print(newNum + " ");
		}
			
		} while (newNum != 1);
	

		if (state.equals("v")){
			System.out.println("(" + counter + ")");
		}
	} 
	System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
   }
 }
