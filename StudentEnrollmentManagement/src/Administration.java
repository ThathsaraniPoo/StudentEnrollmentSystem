import java.util.Scanner;

public class Administration {
	private String firstName;
	private String lastName;
	private int administrationYear;
	private int cost;
	private String subjects=null;
	private int chargeOfASubject=600;
	private static int id=1000;
	private int identy;  
	private int totBalance=0;
	private int paid=0;
	
	public Administration() {
		//create the constructor for enter students name and year
		Scanner fName= new Scanner(System.in);
		System.out.println("Enter the first name :");
		this.firstName=fName.nextLine();
		
		Scanner lName= new Scanner(System.in);
		System.out.println("Please enter last name :");
		this.lastName=lName.nextLine();
		
		Scanner addYear= new Scanner (System.in);
		System.out.println("Please enter the addministration year :\n3 for final Year\n2 for intermidiate year\n1 for first year"+"/nThank you for the payment!!!!!!!!");
		this.administrationYear=addYear.nextInt();
		
		
		
		setId();
		
		
	}
	
	//create the id with the first number being their grade level (must have 5 digits)
	private void setId() {
		id++;
		this.identy=administrationYear + id;
		
		
	}
	
	//get what are the subjects they have chosen & calculate the total cost as per their chose subjects
	public void enroll() {
		do {
		System.out.println("Please enter the subjects (q to quite!):");
		Scanner sub= new Scanner (System.in);
		String course= sub.next();
		
		if(!course.equals("q")) {
		subjects= subjects+" , " +course;
		totBalance+=chargeOfASubject; 	
		}else {
			System.out.println("Break!!!");
			break;
		}
		}while (1 !=0) ;
		
		
		
	}
	
	//should view the balance and pay the tuition
	public void  payment() {
		Scanner ob= new Scanner(System.in);
		System.out.println("How much you are going to pay for the tution???");
		int paid = ob.nextInt();
		this.paid=paid;
		totBalance= totBalance-paid;
		
	}
	 public String showInfo() {
		 return ("The full name is :"+firstName+" "+lastName+"\nThe Id is :"+ id +"\nSubjects : "+subjects+"\nOverall tution fees :" +chargeOfASubject+"\nThe payment :"+paid+"\nThe balance payment is :"+totBalance);
	 }
	// should see the statement name,ID, course enrolled and balance

}
