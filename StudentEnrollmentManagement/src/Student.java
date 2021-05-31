import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
  
	//ask how many students are enrolling
		   
   System.out.println("Please enter the amount of students :");
   
   Scanner in = new Scanner(System.in);
    int noStude = in.nextInt();
	Administration student []= new Administration[noStude];
    
	//iterating no of students all methods
    for(int n=0;n<noStude;n++) {
    	 student[n] = new Administration();
    	    student[n].enroll();
    	    student[n].payment();
    	    System.out.println(student[n].showInfo());
    		
    	
    }
	
	
	
	}

}
