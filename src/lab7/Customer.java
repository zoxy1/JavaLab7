package lab7;

public class Customer {
	
	private int id=0;
	String name="�� �������";
	int post=0;
	String tel="�� ������";
	String email="�� ������";
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
		System.out.println("���������� �������������:"+id);
		System.out.println("���:"+name);
		System.out.println("�������� �����:"+post);
		System.out.println("�������:"+tel);
		System.out.println("Email:"+email);
	
	}
}
