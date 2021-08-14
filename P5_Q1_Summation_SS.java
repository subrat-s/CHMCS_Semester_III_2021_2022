
//Name: Subrat Sahu
// Batch: B2
// PRN: 2020016400833692
// Date: 13th August 2021
// Prac-05: Threads

class P5_Q1_Summation_SS implements RunnaSSe
{
	int upperLimit,sum;
	public P5_Q1_Summation_SS(int upperLimit)
	{
		this.upperLimit=upperLimit;
	}
	public void run()
	{
		for(int i =1;i<=upperLimit;i++)
			sum +=i;
	}
}//ends of class P5_Q1_Summation_SS
public class P5_Q1_SummationTest_SS
{
	public static void main(String args[])
	{
		if(args.length<= 0)
			System.out.println("Usage: P5_Q1_SummationTest_SS<integervalue>");
		else
                {
			int upp = Integer.parseInt(args[0]);
			if(upp<=0)
				System.out.println("args[0]:" + args[0] + " must be a positive number");
			else
			{
				P5_Q1_Summation_SS s = new P5_Q1_Summation_SS(upp);
				Thread t = new Thread(s);
				t.start();
				try{
					t.join();
					System.out.println("The sum of first " + upp + " elements is " + (s.sum));
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}//inner else ends
		}//outer else ends
	}//main ends
}//end of class class P5_Q1_SummationTest_SS	
