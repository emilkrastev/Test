import java.math.BigDecimal;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class ShoppingCart {

	private Map<Item, Integer> items = new HashMap<Item, Integer>();
	
	
	public ShoppingCart(){
		
	}
	public void addItemToCart(Item item){
		if(this.items.containsKey(item)){
			items.put(item, items.get(item).intValue() + 1);
		}
		else{
			items.put(item, 1);
		}
	
	}
	public void removeItemFromCart(Item item){
		for(Item itemsIn : this.items.keySet()){
			if(itemsIn.equals(item)){
				this.items.remove(item);
			}
		}
	}
	public BigDecimal getTotal(){
		BigDecimal sum = new BigDecimal(0);
		for(Item item : this.items.keySet()){
			sum = sum.add(item.getPrice().multiply(new BigDecimal(this.items.get(item))));
		}
		return sum;
	}
	public int getNumberOfItems(){
		return items.size();
	}
	public boolean isEmpty(){
		return (items.isEmpty());
	}
	public Map<Item, Integer> getItems(){
		return this.items;
	}
}
