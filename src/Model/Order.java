package Model;
import java.util.List;
import service.DiscountCalculator;
import service.TaxCalculator;

public class Order {
	public String customerName;
	public CustomerType customerType;
	public List<String> items;
	public double totalAmount;
	public double discount;
	public double tax;
	
	private DiscountCalculator discountCalculator;
	private TaxCalculator taxCalculator;
	
	public Order(String customerName, CustomerType customerType, List<String> items, double totalAmount) {
	        this.customerName = customerName;
	        this.customerType = customerType;
	        this.items = items;
	        this.totalAmount = totalAmount;
	        this.discount = 0;
	        this.tax = 0;
	        this.discountCalculator = new DiscountCalculator();
	        this.taxCalculator = new TaxCalculator();
	 }
	public void applyDiscount() {
        this.discount = discountCalculator.calculateDiscount(this.customerType, this.totalAmount);
    }
	public void calculateTax() {
        this.tax = taxCalculator.calculateTax(this.totalAmount);
    }
	public void printOrderDetails() {
        double finalAmount = this.totalAmount - this.discount + this.tax;
        System.out.println("Cliente: " + this.customerName);
        System.out.println("Tipo de Cliente: " + this.customerType);
        System.out.println("Artículos: " + String.join(", ", this.items));
        System.out.println("Monto Total: " + this.totalAmount);
        System.out.println("Descuento: " + this.discount);
        System.out.println("Impuesto: " + this.tax);
        System.out.println("Monto Final: " + finalAmount);
    }
	
	
}