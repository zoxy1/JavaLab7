package lab7;

public class Customer {
	
	private int id=0;
	String name="не указано";
	int post=0;
	String tel="не указан";
	String email="не указан";
	public void setCustomerInfo(int id,String name,int post, String tel ){
		this.id=id;
		this.name=name;
		this.post=post;
		this.tel=tel;
	}
	public void setCustomerInfo(int id,String name,int post, String tel, String email){
		this.id=id;
		this.name=name;
		this.post=post;
		this.tel=tel;
		this.email=email;
		}
	public void display(){
		System.out.println("Уникальный идентификатор:"+id);
		System.out.println("Имя:"+name);
		System.out.println("Почтовый адрес:"+post);
		System.out.println("Телефон:"+tel);
		System.out.println("Email:"+email);
	
	}
}
