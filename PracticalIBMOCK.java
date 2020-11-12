
public class PracticalIBMOCK {

	public static void main(String[] args) {
	
		IBIO.output("Soumil Mittra");
		double sum = 0; // to ensure accurate averages with the right decimal value
		int min = 0;
		int max = 0;
		
		int num = IBIO.inputInt("Range daal: ");
		while (num < 5) // keep asking for number if number is below what we need
		{
			IBIO.out("Out of range lahhh cb knn bay chao!!!!!");
			num = IBIO.inputInt("Range daal: "); // input again
		}
		int n = 0;
		 for (int i = 0; i < num; i++)
		 {
			 n = IBIO.inputInt("enter a number");
			 // if this is the first number that we input, set min and max to that first input number, to get accurate min and max values
			 if(i == 0)	// first time the loop runs
			 {
				 min = n;
				 max = n;
			 } else // if it's not the first time we run the loop check if the min and max have to be updated or not, based on the following input numbers
			 {
				 if (n < min)
			 	{
					 min = n;
			 	}
			 	if (n > max)
			 	{
					 max = n;
			 	}
			 }
			 sum += n;
		 }
		 int range = max - min;
		 double average = sum/n;
		 IBIO.out("max: "+max);
		 IBIO.out("min: "+min);
		 IBIO.out("range: "+range);
		 IBIO.out("average: "+average);
		 
		 
		 
		}
	

}
