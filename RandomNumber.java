package mainPackage;

import java.util.Random;

public class RandomNumber {

	Random random = new Random();
	int answer;

	public int GetANumber_Between_1_and_10(int high)
	{
		answer = random.nextInt(high)+1;
		return answer;
		
	}
}
