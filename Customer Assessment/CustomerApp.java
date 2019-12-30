import java.util.*;
public class CustomerApp {
	public static String Loginid;
	public static String Loginpassword;
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ABC Corporation\n");
		System.out.println("Enter the id: ");
		Loginid=sc.next();
		System.out.println("Enter the password: ");
		Loginpassword=sc.next();
		
		if(Loginid.equals("ABCCust") && Loginpassword.equals("abc@123"))
		{
			System.out.println("You logged in Successfully");
			
			Customer[] customers = new Customer[10];
			customers[0] = new Customer(1001,"Bhakti","bhakti10gmail.com",123);
			customers[1] = new Customer(1002,"Harsh","harsh15gmail.com",456);
			customers[2] = new Customer(1003,"Prerit","prerit17gmail.com",789);
			customers[3] = null;
			customers[4] = null;
			customers[5] = null;
			customers[6] = null;
			customers[7] = null;
			customers[8] = null;
			customers[9] = null;
			
			System.out.println("1. Add Customer details \n" 
					+"2. Print Customer Details \n"
					+"3. Edit Existing Details \n"
					+"4. Delete Existing Customer \n"
					+"5. Exit");
			
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			
			do{
				int id;
				String name;
				String email;
				int mobileno,n ;
				switch(choice)
				{
				case 1:	
					char a;
					do {
					System.out.print("Enter customer Id: ");
					id = sc.nextInt();
					System.out.print("Enter customer name: ");
					name = sc.next();
					System.out.print("Enter customer email: ");
					email = sc.next();
					System.out.print("Enter customer mobile No.: ");
					mobileno = sc.nextInt();

					for (int i = 0; i < customers.length; i++) {
						if (customers[i] == null) {
							customers[i] = new Customer(id, name, email, mobileno);
							break;
						}
					}
					System.out.println("Do you wish to continue? (Y/N)");
			        a = sc.next().charAt(0);
					} while(a=='Y'|| a=='y');
					break;
					
					
				case 2:
					System.out.print("enter the customer id:");
					id=sc.nextInt();
					for(int i=0;i<10;i++)
					{
						if(customers[i]!=null){
						if(customers[i].getId()==id){
							
							customers[i].printCustomerDetails();							
						}
						}
					}					
					break;
				
				case 3: 
					System.out.println("Enter the Id of customer: ");
					n = sc.nextInt();

					System.out.print("Enter customer Id: ");
					id = sc.nextInt();
					System.out.print("Enter customer name: ");
					name = sc.next();
					System.out.print("Enter customer email: ");
					email = sc.next();
					System.out.print("Enter customer mobile No.: ");
					mobileno = sc.nextInt();

					for (int i = 0; i < customers.length; i++) {
						if (customers[i] != null && customers[i].getId() == n) {
							customers[i] = new Customer(id, name, email, mobileno);
							break;
						}
					}
					break;
				
				case 4: 
					System.out.println("Enter the Id of customer: ");
					n = sc.nextInt();

					for (int i = 0; i < customers.length; i++) {
						if (customers[i] != null && customers[i].getId() == n) {
							customers[i] = null;
							break;
						}
					}
					break;
				
				case 5:
					System.out.println("Goodbye!");
					break;
				}
			}while(choice!=5);
		}
		else
		{
			System.out.println("Invalid ID or Password. Please Enter Correct ID and Password");
		}	
		sc.close();	
	}
} 
