
public class ForLoopPractise {

	public static void main(String[] args) {
		String name = "Soumil";
		int count;
		for (count=1; count<=7; count ++) {
			IBIO.output (name);
			
		}
		
		
		//sum of 5 numbers
		int count1;
		int a;
		int sum = 0;
		for (count1=1; count1<=5; count1 ++) {
			a= IBIO.inputInt("enter number");
		sum = sum + a;

		}
		IBIO.output(sum);
		IBIO.output(sum/5.0);

	

	}

}
