//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name = args[0];
            int num = Integer.parseInt(args[1]);
            int length = name.length();
            String vowels = "AEFHILMNORSX";

            for(int i = 0; i < length; i++ ){
                char letter = name.charAt(i);
                int pos = vowels.indexOf(letter);

                if(pos != -1){
                        System.out.println("Give me an " + letter + ": "  + letter + "!");
                } else{
                        System.out.println("Give me a " + letter + ": " + letter + "!");
                }
                }
            System.out.println("What does that spell?");
            
           for ( int i = 0; i < num; i++){
                System.out.println( name.toUpperCase() + "!!!" );
                }
        }
}
