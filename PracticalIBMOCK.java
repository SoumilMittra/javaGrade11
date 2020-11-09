
public class PracticalIBMOCK {

	public static void main(String[] args) {
	
		IBIO.output("Soumil Mittra");
		int sum = 0;
		int min = 1000;
		int max = 0;
		
		int num = IBIO.inputInt("Range daal: ");
		if (num < 5)
		{
			IBIO.out("Out of range lahhh cb knn bay chao!!!!!");
			System.exit(0);
		}
		int n = 0;
		 for (int i = 0; i < num; i++)
		 {
			 n = IBIO.inputInt("enter a number");
			 if (n < min)
			 {
				 min = n;
			 }
			 if (n > max)
			 {
				 max = n;
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