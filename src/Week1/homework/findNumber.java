package src.Week1.homework;

public class findNumber {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,3,4,5};
        int aranacak = 12;
        boolean isFind = false;
        for (int sayi:sayilar){
            if(sayi == aranacak){
                isFind = true;
            }
        }

        if(isFind){
            System.out.println("Sayı mevcut.");
        }else{
            System.out.println("Sayı mevcut değil.");
        }
}
}
