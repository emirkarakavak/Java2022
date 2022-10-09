package Week1.src.homework;

public class demo2 {
    public static void main(String[] args) {
        
        double[] myList = {1.5,1.4,1.6,2.4};
        double total=0;
        double max = myList[0];
        for(double list:myList){
            total+=list;
            if(max<list)
            max=list;
        
        }
        System.out.println(total);
        System.out.println(max);

    }
}
