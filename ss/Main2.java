package Lectia5;

public class Main2 {
   public static void main(String[] args) {
	   ShoppingCart sc = new ShoppingCart();
	   for(int i = 0; i < sc.list.length; i++) {
		   sc.list[i] = new Product(i + 10);
	   }
	   int totalPrice = sc.computePrice();
	   System.out.println(totalPrice);
   }
}
