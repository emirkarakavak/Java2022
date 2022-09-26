package src.Week1.homework;

public class switchCase {
    public static void main(String[] args) {
        
        String grade = "A";
        switch (grade) {
            case "A":
                System.out.println("Very good");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Normal");
                break;
            case "D":
                System.out.println("Bad");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
            System.out.println("Wrong grade");
                break;
        }
            
    }
}
