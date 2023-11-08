import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //int s; good
        //int class; can't
        /*
      constant variable
        final int MY_CONSTANT_INT = 42;
        System.out.println(MY_CONSTANT_INT);
         */
        /*
        input from user
        Scanner input= new Scanner(System.in);
        System.out.printf("write the number you want to print: ");
        double d= input.nextDouble();// this is the variable you do to input the variable so print the instruction before it
        System.out.println("this is the result from input user: "+d);*/
        /*
        assignment statments
           int x=3;
        int y;
        System.out.println(x);
        System.out.println(y=2);
        int z = x=5;
        System.out.println(z+x);
            */
        /*
       // float f = 5.5; this wrong
        float f = 5.5F;
        double x = 5.5;
        System.out.println(f);
        System.out.println(x);
        */
        //scientific notation
        /*
        double y = 1E8; //only double
        System.out.println(y);
         */

        // numeric operations
        // all as usual nut the new is the negative in module
        /*
        int x= 5%2;
        int y= 5%-2;
        int z= -5%-2;
        int d= -5%2;
        System.out.println((x));
        System.out.println((y));
        System.out.println((z));
        System.out.println((d));
         */
        //Augmented Assignment Operators
        /*
        int x =5;
        x =x+5; // x+=5
        //note: there's no spaces between + and = if you do it, it's syntax error;
        //x + = 5;
        System.out.println(x);

         */
        //increment and decrement
        /*
        int x=1;
        x++; //post increment
        ++x; // preincrement
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);

         */
        /*
        // math random accept double and generate randoms number between 0.0 and 1.0. to control the range of numbers you can multiply it to 10,100,100,...
        double x = Math.random()*10;
        System.out.println(x);
        */

        /*When performing a binary operation involving two operands of
different types, Java automatically converts the operand as follow:
1. If one of the operands is double, the other is converted into double.
2. Otherwise, if one of the operands is float, the other is converted
into float.
3. Otherwise, if one of the operands is long, the other is converted
into long.
4. Otherwise, both operands are converted into int
*/
        //type casting
        /*
        double x = 5/2; // not wrong but it will not show you what you think
        double y = 5/2.0;
       // int i = 3.0; //this wrong you have to write it like this
            int i =(int) 3.0;
       System.out.println(x);
       System.out.println(y);
        System.out.println(i);

         */
        // write a program to calculate the tax with two numbers after the decimal points
        // you can use the concept we learned from c and use (printf)
        // you can print in java in multiple ways.. java is good
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.printf("Sales tax is %.2f",tax );

         */
        /*Assignment operators are right-associative.
Therefore, the expression
a = b += c = 5 is equivalent to a = (b += (c = 5))
*/
        // java supports unicode, you increment and decrement it
        /*
        char letter = '\u0041';
        System.out.println(letter); char a=97;
        System.out.println(a);
  int i ='a'; //careful if you int i = "a", it will be syntax error it has to be in signle quotation
        System.out.println(i);
         */
/*  character methodsx
        char ch = 'A';

        // Check if the character is a digit
        boolean isDigit = Character.isDigit(ch);
        System.out.println("Is digit? " + isDigit);

        // Check if the character is a letter
        boolean isLetter = Character.isLetter(ch);
        System.out.println("Is letter? " + isLetter);

        // Check if the character is a letter or digit
        boolean isLetterOrDigit = Character.isLetterOrDigit(ch);
        System.out.println("Is letter or digit? " + isLetterOrDigit);

        // Check if the character is a lowercase letter
        boolean isLowerCase = Character.isLowerCase(ch);
        System.out.println("Is lowercase? " + isLowerCase);

        // Check if the character is an uppercase letter
        boolean isUpperCase = Character.isUpperCase(ch);
        System.out.println("Is uppercase? " + isUpperCase);

        // Convert the character to lowercase
        char lowerCaseChar = Character.toLowerCase(ch);
        System.out.println("Lowercase character: " + lowerCaseChar);

        // Convert the character to uppercase
        char upperCaseChar = Character.toUpperCase(ch);
        System.out.println("Uppercase character: " + upperCaseChar);
        */
        // let's try String
/*
        String message = "Hello welcome to strings with capital s";
        System.out.println(message+ message.length());
        //string concatination
        String s3 = s1.concat(s2); or String s3 = s1 + s2;
        */
        //string methods
        /*
        String sampleString = "  Hello, World!  ";

        // Get the length of the string
        int length = sampleString.length();
        System.out.println("Length of the string: " + length);

        // Get the character at a specific index
        char charAtIndex = sampleString.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Concatenate two strings
        String concatenatedString = sampleString.concat(" Welcome");
        System.out.println("Concatenated String: " + concatenatedString);

        // Convert the string to uppercase
        String upperCaseString = sampleString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);

        // Convert the string to lowercase
        String lowerCaseString = sampleString.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);

        // Remove leading and trailing whitespace
        String trimmedString = sampleString.trim();
        System.out.println("Trimmed String: " + trimmedString);

         */
        /*
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";
        String str4 = "Hello, World";

        // Compare two strings for equality (case-sensitive)
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual);

        // Compare two strings for equality (case-insensitive)
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("str1 equalsIgnoreCase str2: " + isEqualIgnoreCase);

        // Compare two strings lexicographically
        int compareToResult = str1.compareTo(str3);
        System.out.println("str1 compareTo str3: " + compareToResult);

        // Compare two strings lexicographically (case-insensitive)
        int compareToIgnoreCaseResult = str1.compareToIgnoreCase(str2);
        System.out.println("str1 compareToIgnoreCase str2: " + compareToIgnoreCaseResult);

        // Check if a string starts with a specified prefix
        boolean startsWithResult = str4.startsWith("ha;;p");
        System.out.println("str4 starts with 'Hello': " + startsWithResult);

        // Check if a string ends with a specified suffix
        boolean endsWithResult = str4.endsWith("World");
        System.out.println("str4 ends with 'World': " + endsWithResult);

         */
        // selectors and loops same as  c and c++ there's no diffrence


        //Arrays!!!!!
      //double[]  arr= new double[10];// create array
       // double arr[] = new double[10];// another way to create array and more closer to c and c++
        //you can declare,create,initialize in one step look below
       // double[] arr= {1.0,1.2,1.3};
        /*
      arr[0]=1;
      System.out.println(arr[0]);
      System.out.println(arr.length); // find the size of array
      */
        //Initializing arrays with input values
        /*
        Scanner input = new Scanner(System.in);
        int [] mylist = new int[5];
        System.out.print("Enter numbers you want store: ");
        for (int i =0; i<mylist.length;i++){
            mylist[i] = input.nextInt();

        }

        for (int i =0; i<mylist.length;i++){
            System.out.println(mylist[i]);
        }

         //here' anoher enhancment way to print arry

        //for(int value: mylist)
          //  System.out.println(value);
            */
         // you can equalize arrays with each other like below example
        //list1 =list2
        //java provide method called arrayCopy help more in this situation
        //System.arraycopy(sourceArray, Index in source array, targetArray, Index in target array, sourceArray.length);

        //passing array to functions
       // int [] list ={1,2,3,4,5};
        //printArray(list);
        //you can pass array in the method using this way but array is Anonymous
        //printArray(new int[] {5,4,3,2,1});
        /*
        there's function in the class explain how reverse method works
        int[] list1 = {1,2,3,4,5};
        int []list2 = reverse(list1);
        for(int value:list2){
            System.out.println(value);
        }

         */






    }
    //examples for functions.. in java they call it method.. these developers are weird
        //functions is written in another file or written in the class but not inside main class
        public static int sum(int i1, int i2) {
            int result = 0;
            for (int i = i1; i <= i2; i++)
                result += i;

            return result;
        }
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
    // you can overload the method.. if you just change the parameters of the function
    public static double max(double num1, double num2)
    { if (num1 > num2)
        return num1;
    else
        return num2;
    }
    //you can use void if you don't need to return result
    //to run void method you just call function and don't need to put it in variable
    public static void maxx(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        System.out.println(result);
    }
    /*
    careful here, this method is logically correct but java thinks that return -1 mean compilation error
    public static int sign(int n) {
        if (n > 0)
            return 1;
        else if (n == 0)
            return 0;
        else
            return –1;
    }

     */
    //array method
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //method return array
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i =0, j= list.length-1;i <list.length;i++,j--){
        result[j]= list[i];
        }
        return result;
    }
    //if you don't know how many items you will pass, you can write the parameter in this way
    //then you can pass as you want in the function without any errors
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];

        System.out.println("The max value is " + result);
    }
}



}
