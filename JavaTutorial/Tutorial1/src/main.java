public class main {

    //this is a comment

    /**
     * This is a multiline comment
     *
     */

    //psvm
    public static void main(String[] args) {
        int product; //this is a declared variable with no known value as of now

        //You will typically use 3 primitive data types (most common)

        //This is a variable that only holds integer (no decimal point)
        int num_integer = 5;

        //type sout to auto-fill a system output  System.out.println();
        //lets multiply the above value with 3
        product = num_integer * 3;
        System.out.println("num_integer*3 = " + num_integer + "*3 = " + product + "\n"); // \n is a new line

        //This variable can be an integer OR include decimal points.
        double num_double = 1.50;

        //We can override variables or convert them to other data types.
        //Currently, num_integer is an integer. Java will not allow us to take the product of a int and double.
        //Lets convert the results from earlier into a double and multiply it by the num_double variable.
        //This can ve done in 2 different ways...
        double method1 = product; //this is the easier way but make sure you know what you are doing.
        double method2 = Double.valueOf(product); //2nd best method but not used as often.

        //Lets see if the product now gives us a floating point number
        double product2 = method1 * num_double;
        System.out.println("method1*" + num_double + " = " + product2 + "\n");

        //This variable holds single characters/letters
        char c = 'D';
        //but we can also use strings and for now, we will just show this as an output
        String word_string = "This is a string of characters\n";
        System.out.println(word_string);


    }
}
