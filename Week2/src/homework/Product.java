package Week2.src.homework;

public class Product {

    // public Product(){
    //     System.out.println("Yapıcı blok çalıştı");
    // }

    // public Product(int id, String name, String description, double price, int stockAmount, String code){
    // }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String code;

    //getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public int getStockAmount(){
        return stockAmount;
    }
    public String getCode(){
        return this.name.substring(0,1) + id; 
    }

    //setter
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setStockAmount(int stockAmount){
        this.stockAmount = stockAmount;
    }
}


