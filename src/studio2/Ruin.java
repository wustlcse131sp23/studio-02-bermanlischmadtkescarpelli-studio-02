package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you have?");
		double startAmount = in.nextDouble();
		System.out.println("What is the probability that you win?");
		double winChance = in.nextDouble();
		System.out.println("What amount of money earned would you consider to be a successful day?");
		double winLimit = in.nextDouble();
		System.out.println("How mny simulations?");
		double totalSimulations = in.nextDouble();
		
		int numberOfRounds = 0;
		while ((startAmount > 0)&&(startAmount<winLimit))
			{
				if (Math.random() < winChance) 
				{
					startAmount = startAmount + 1;
				}
				else
				{
					startAmount = startAmount - 1;
				}
				numberOfRounds ++;
			}
		String result = "i";
		{
				if (startAmount >= winLimit)
				{
					String result = "win";
				}
				else 
				{
					String result = "loss";
				}
				
				
				}
		System.out.println("Simulation 1:" + numberOfRounds + result);
		
	}

}
