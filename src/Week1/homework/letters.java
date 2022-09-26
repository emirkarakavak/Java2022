package src.Week1.homework;

public class letters {
    public static void main(String[] args) {
        char letter='A';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli");
                break;
        
            default:
            System.out.println("İnce sesli");

                break;
        }
}
}
