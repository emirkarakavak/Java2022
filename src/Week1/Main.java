package src.Week1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //#region ConditionalStatements
        int number1 = 18;
        int number2 = 11;
        if(number1 > number2){
            System.out.println("Number1 bigger than Number2.");
            System.out.println("Number1: " + number1 + "\n" + "Number2: " + number2);
        } else if(number2 < number1){
            System.out.println("Number2 bigger than Number1.");
            System.out.println("Number1: " + number1 + "\n" + "Number2: " + number2);
        } else{
            System.out.println("Both of numbers equals each other.");
        }
       // #endregion


    }


    
}
