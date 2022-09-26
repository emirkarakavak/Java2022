package src.Week2.homework;

public class methods {
    public static void main(String[] args) {

       findNumber();
}

    public static void findNumber() {
        int[] numbers = new int[]{1,2,3,4,5};
        int wanted = 12;
        boolean isExist = false;
        for (int sayi:numbers){
            if(sayi == wanted){
                isExist = true;
            }
        }

        if(isExist){
            sendMessage("Sayı mevcut.:" + wanted);
        }else{
            sendMessage("Sayı mevcut değil.:" + wanted);
        }
    }

    public static void sendMessage(String msg) {
        System.out.println(msg);
        
    }

}
