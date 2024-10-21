import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//1)Develop a program that takes the weight (in kilograms) and height (in meters)
//as input and calculates the BMI, then prints it

         Scanner input =new Scanner(System.in).useLocale(Locale.US);
          System.out.println("1) Lets calculate your BMI!");
          System.out.print("please enter weight in kilograms:");
          double weight= input.nextDouble();
          System.out.print("please enter height in meters:");
          double height = input.nextDouble();
        System.out.printf("Your BMI is: %.2f", weight / (height * height));
        System.out.println("_______________________________");

//        2) Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
//        • Input: Obtained Marks = 85, Total Marks = 100
//        • Expected Output: Percentage = 85.0%

        System.out.println("2)calculate your percentage");
        System.out.print("please enter your mark out of 100:");
        double mark=input.nextDouble();
        System.out.println("Your percentage is: "+ (mark/100)*100 +"%");
        System.out.println("_______________________________");

        //3)Create a program that takes an amount in one currency and an exchange rate
        //as input, then converts and prints the amount in another currency.

        System.out.println("3)currency exchange from USD to EUR");
        System.out.print("please enter amount in USD:");
        double usd=input.nextDouble();
        System.out.println("after exchange to EUR: "+ usd*0.85);
        System.out.println("_______________________________");

        //4)Create a program that takes a string as input, calculates its length, and then
        //reverses the string using the StringBuilder class, finally printing both the length and
        //reversed string.

        System.out.println("4)StringBuilder question");
        System.out.print("please enter any string:");
        input.nextLine();
        String sb_input=input.nextLine();
        System.out.println("the length of th Sting is:"+sb_input.length());
      StringBuilder sb= new StringBuilder(sb_input);
       sb.reverse();
       System.out.println("The reverse string is:"+sb+ ",and the lenght of the string is:"+ sb.length());
        System.out.println("_______________________________");

        //5)Develop a program that takes a sentence as input and extracts a substring from
        //it, then prints the extracted substring.

        System.out.println("5)extracts a substring from sentence");
        System.out.print("please enter any string:");
        String sentence=input.nextLine();
        System.out.println("Output: "+sentence.substring(10,20));
        System.out.println("_______________________________");

        //6)Write a program that takes a sentence and a keyword as input, then check if
        //the keyword is present in the sentence and prints the result.
        //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
        //"jumps"
        //• Expected Output: Keyword "jumps" is present in the sentence.

        System.out.println("6)Let's check the keyword in the sentence!");
        System.out.print("please enter a sentence:");
        String sentence_key=input.nextLine();
        System.out.print("enter a Keyword:");
        String keyword=input.nextLine();
       if (sentence_key.contains(keyword))
           System.out.println("the keyword ("+ keyword+ ") is present  in the sentence");
       else
           System.out.println("Sorry! the keyword ("+ keyword+ ") not found");
        System.out.println("_______________________________");

       //7)Develop a program that takes a sentence and a word to replace as input, then
        //replace all occurrences of the word with another word and prints the modified
        //sentence.

        System.out.println("7)Let's try to replace words in the sentence!");
        System.out.print("please enter a sentence:");
        String sentence_to_replace=input.nextLine();
        System.out.print("enter a word you want to replace:");
        String exist_word=input.nextLine();
        System.out.print("enter exist word you want to replace:");
        String  replacement_word= input.nextLine();
        System.out.println(sentence_to_replace.replaceAll(exist_word,replacement_word));
        System.out.println("_______________________________");


        //8)Write a program that takes two strings as input and check if they are equal,
        //ignoring the case, then prints whether they are equal or not.
        System.out.println("8)last but no lease ,enter 2 string and I will check if it equal");
        System.out.print("please first string:");
        String first_string=input.nextLine();
        System.out.print("enter the second string:");
        String second_string=input.nextLine();
       if (first_string.equalsIgnoreCase(second_string))
           System.out.println("Strings are equal");
       else
           System.out.println("String are not equal");
        System.out.println("_______________________________");


        System.out.println("Thank you ,Well Done !!!!");













    }
}