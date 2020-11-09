
public class Practise {

	public static void main(String[] args) {
		String name ;
		name = "Soumil";
		int age;
		age = 17;
		IBIO.output ("Hi " + name + " you are " + age + " years old"); 
		
		double score;
		score = IBIO.inputInt("please enter the score ");
		IBIO.output ("your score is "+ score);
		score = score + 0.1*score;
		IBIO.output ("your increased score is "+score);
		
		double height=5.534;  //declared height and assigned 5.5 to height
		IBIO.output(height); // printing the value of height variable
		IBIO.output (height);// printing the value of height variable
		IBIO.output (height);// printing the value of height variable
		IBIO.output (height);// printing the value of height variable

		
		
		height = IBIO.inputDouble("please enter your height"); // changing the value of height variable with user-input
		IBIO.output (height);// printing the value of height variable
		IBIO.output (height);// printing the value of height variable
		IBIO.output (height);// printing the value of height variable
		IBIO.output (height);// printing the value of height variable
		
		



	}

}
