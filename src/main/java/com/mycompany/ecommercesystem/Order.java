package com.mycompany.ecommercesystem;
public class Order {
   protected int Customerid;
   protected int orderId;
   protected product []products;
   protected float totalprice;
    public Order() {
    }
    public Order(int Customerid, int orderId) {
        this.Customerid = Customerid;
        this.orderId = orderId;
    }
public void printinfo(Cart PRODUCT){
      this.products =new product[PRODUCT.nproduct];
    System.out.println("the orderid  " +orderId+ "\n customer id :"+Customerid );
  
   this. products=PRODUCT.getArrproducts();
    System.out.println("the products :\n");
    if (products==null){
} else {
        for (int j=0;j<PRODUCT.getArrproducts().length;j++) {
            
            System.out.println(products[j].getPrice()+" -  $"+products[j].getName());
            totalprice +=products[j].getPrice();
            
            System.out.println("the total price is: $" +totalprice);
        }
       }
}   
}
