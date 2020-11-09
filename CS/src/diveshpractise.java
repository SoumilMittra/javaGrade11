
public class diveshpractise {

//	private static int c;
//	private static String a1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IBIO.output((double)70/100);
//		int a=3;
//		int b=7;
//		int c = a+b;
//		IBIO.output("the sum of " + a + " and " + b + " is " + c );
//		IBIO.output("the result is " + (a + b) );
//		IBIO.output(a + b + " is the result");
//		IBIO.output("the result is " + a + b*5 );
//		IBIO.output("the result is " + (a + b*5) );
		
	   // a1 = IBIO.input("enter a number");
//	    double price = IBIO.inputDouble("enter a number: ");
//	    if(price<0) {  // == != >= <= > <
//	    	IBIO.output("invalid price");
//	    	IBIO.output("cannot be negative");
//	    }else if(price==0) {
//	    	IBIO.output("are you sure about the price");
//	    }else {
//	    	IBIO.output("price should be right");
//	    }
	    
	    //Question:   1 station $0.27, minimal fare 70 cents
//	    int numOfStationsTravelled = IBIO.inputInt("enter the number of stations ");
//	    double ticketPrice = numOfStationsTravelled * 0.27;
//	    if (ticketPrice< 0.7) {
//	    	ticketPrice = 0.7;
//	    } 
//	    IBIO.output("ticketPrice: " + ticketPrice);
	    
	    ///// Question //////////////
	    // region A fare: first min $1.2  subsequent minutes $0.7
	    // region B fare: first min $0.9  subsequent minutes $0.4
	    // input numOfMin (int) and region (String "Alice" /char 'A')
	    // you may assume numOfMin is positivie and region is always valid
	    
	    // input both variables
//	    String region = IBIO.input("enter the region code ");
//	    int min = IBIO.inputInt("enter the duration of the call in minutes ");
//	    double fare;
//	    // IBIO.output("["+ region +"] " + "min: " + min);
//	    // decide by the region
//	    
//	    // if region is of the type character
//	    // region == 'A'
//	    if(region.equals("A") ) {
//	    	if(min==1) {  // numOfMin is 1
//	    		fare = 1.2;
//	    	}else { // numOfMin is more than 1
//	    		fare = 1.2 + (min-1)*0.7;
//	    	}
//		    IBIO.output("phone call fare: " + fare);	
//	    }else if(region.equals("B") ){
//	    	if(min==1) {  // numOfMin is 1
//	    		fare = 0.9;
//	    	}else { // numOfMin is more than 1
//	    		fare = 0.9 + (min-1)*0.4;
//	    	}	   
//		    IBIO.output("phone call fare: " + fare);
//	    }else {
//	    	IBIO.output("error. invalid input");
//	    }
		
		// input an integer and decide whether it is even or odd
//	    int num = IBIO.inputInt("enter an integer ");
//	    if(num%2==0) {
//	    	IBIO.output("The number is even");
//
//	    }else {
//	    	IBIO.output("The number is odd");
//	    }
	    
	    int num = IBIO.inputInt("enter a number");
	    if (num<=100) {
	    	if(num<0) {
	    		IBIO.output("invalid");
	    	}else{
	    		IBIO.output("correct");
	    	}
	    	
	    }else { 
	    	IBIO.output("invalid");
	      	
	    }

	    if (num>=0 && num<=100) { //valid condition
	    	IBIO.output("correct");
	    }else { 
	    	IBIO.output("invalid");
	    }
	    
	    if (num<0 || num>100) {  // !(num>=0 && num<=100) // invalid condition
	    	IBIO.output("invalid");
	    }else { 
	    	IBIO.output("correct");
	    }
	    
		

	}

}
