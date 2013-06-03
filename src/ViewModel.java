import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ViewModel {
	private ShoppingCart shoppingCart;
	public ViewModel(ShoppingCart shoppingCart){
		this.shoppingCart = shoppingCart;
		Product comp = new Product("Intel i7", "the fastet cpu ever", new BigDecimal(500), "Intel", (new GregorianCalendar(2013, 1, 1)).getTime()) ;
		Product trainners = new Product("Lonsdale Camden", "perfect for training", new BigDecimal(20), "Lonsdale", (new GregorianCalendar(2013, 1, 1)).getTime());
		Service instantDelivery =  new Service("Courrier express", "Instant delivery", new BigDecimal(20), 20.00);
		Service mobileInternet = new Service("3G", "ultra fast mobile internet", new BigDecimal(20), 1);
		shoppingCart.addItemToCart(comp);
		shoppingCart.addItemToCart(trainners);
		shoppingCart.addItemToCart(instantDelivery);
	}
	public void printShoppingCart(){
		if(this.shoppingCart.isEmpty()){
			System.out.print("The shopping cart is empty");
		}
		else{
			
			for(Item item : this.shoppingCart.getItems().keySet()){
				item.print();
				System.out.println("Item quantity : ");
				System.out.println(this.shoppingCart.getItems().get(item));
			}
			System.out.println("Total : ");
			System.out.print(this.shoppingCart.getTotal());
		}
	}
	
}
