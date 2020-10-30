
public class Test {

	public static void main(String[] args) {
//		int a, b;
//		a= IBIO.inputInt("enter first number");
//		b= IBIO.inputInt("enter second number");
//		IBIO.output("the product of " + a + " and " + b + " is " + a*b);
		
//		Question:   1 station $0.27, minimal fare 70 cents
        int numOfStationsTravelled = IBIO.inputInt("enter the number of stations ");
	    double ticketPrice = numOfStationsTravelled * 0.27;
	    if (ticketPrice< 0.7) {
	    	ticketPrice = 0.7;
	    } 
	    IBIO.output("ticketPrice: " + ticketPrice);
	    
	    }
	
		
		

	}


