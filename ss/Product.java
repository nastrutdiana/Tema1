package Lectia5;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int price;
	@Override
	public int compareTo(Product arg0) {
		return this.price - arg0.price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Product() {}
	public Product(int price) {
		this.price = price;
	}
	
	
    
}
