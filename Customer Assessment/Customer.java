import java.util.*;
public class Customer
{
	private int id;
	private String name;
	private String Email;
	private int mobileno;
	
	public Customer(int id, String name, String email, int mobileno) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
		this.mobileno = mobileno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	
	@Override
	public String toString() {
		return "Customer [Id =" + id + ", name = " + name + ", Email = " + Email + 
				", Mobileno = " + mobileno + "]";
	}
	
	public void addCustomerDetails(int id,String name,String email,int mobileno)
	{
		Customer c=new Customer(id, name, email, mobileno);
	}
	
	public void printCustomerDetails(){
		System.out.println("Customer[id ="+id+", name = "+name+", email ="+Email+", mobile no ="+mobileno+" ]");
	}
	
	public void editCustomer(int id,String name,String email,int mobileno)
	{
		this.Email=email;
		this.id=id;
		this.mobileno=mobileno;
		this.name=name;
	}
}
