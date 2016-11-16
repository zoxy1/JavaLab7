package lab7;
public class CustomerTest {
   
  public static void main (String args[]) {
 
  Customer myCustomer = new Customer();
  
  myCustomer.display();
  Customer myCustomer1 = new Customer();
  Customer myCustomer2 = new Customer();
  myCustomer1.setCustomerInfo(1, "Андрей", 634526, "+79036541778");
  myCustomer2.setCustomerInfo(2, "Петр", 634062, "+79068032002","mag@yandex.ru");
  myCustomer1.display();
  myCustomer2.display();
  } 
}
