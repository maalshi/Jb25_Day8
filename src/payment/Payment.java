package payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	
	public static void main(String[]args){
		Item item1 = new Item("soap", 200);
		Item item2 = new Item("Shampoo", 400);
		Item item3 = new Item("Tonic", 250);
		
		List<Item> itemlist = new ArrayList<Item>();
		itemlist.add(item1);
		itemlist.add(item1);
		itemlist.add(item2);
		itemlist.add(item3);
		
		purchase(itemlist);
	}
	
	public static void purchase(List<Item> list){
		System.out.println("Список купленных товаров и их стоимость:");
		System.out.println(list);
	}

}
