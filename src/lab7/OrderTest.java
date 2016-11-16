package lab7;


public class OrderTest {

	public static void main(String[] args) {
		
		double totalCost=0.0d;
		
		Order order=new Order(); 	
		Shirt shirt=new Shirt();
		shirt.price=14.0d;
		totalCost=order.addShirt(shirt);
		System.out.println("Полная стоимость заказа: "+totalCost);
		Shirt shirt1=new Shirt();
		shirt1.price=50.0d;
		totalCost=order.addShirt(shirt1);
		System.out.println("Полная стоимость заказа: "+totalCost);
	
	}

}
