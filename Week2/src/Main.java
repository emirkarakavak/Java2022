package Week2.src;

public class Main {
    
    public static void main(String[] args) {
        
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("resim.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(4);
        product2.setImageUrl("resim2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(2);
        product3.setImageUrl("resim3.jpg");

        Product[] products = { product1, product2, product3 };
      
        for(Product product:products){
            System.out.println( product.getName() );
        }
   
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("555");
        individualCustomer.setCustomerNumber("123");
        individualCustomer.setFirstName("Emir");
        individualCustomer.setLastName("Karakavak");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("123123");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = { individualCustomer, corporateCustomer };
        System.out.println(customers.length);
    }

}
