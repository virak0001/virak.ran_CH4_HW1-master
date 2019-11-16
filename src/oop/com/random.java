package oop.com;
import java.util.Arrays;
public class random {
	public static void main(String[] args) {
		
		
		//////////__Random__///////////
		int[] random = new int[15];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int)Math.floor((Math.random() * 10) + 0);
		}
		System.out.println(Arrays.toString(random));
		
		//////////__condition__///////
		String index = "";
		int counter = 0;
		Arrays.sort(random);
		if(Arrays.binarySearch(random,5) < 0) {
			System.out.println("number 5 not found");
		}else {
			for (int i = 0; i < random.length; i++) {
				if(random[i] == 5) {
					counter++;
					index += Integer.toString(i)+" ";	
				}
			}
		 System.out.println("There are " + counter+ " of number 5 found in index as below.");
		 System.out.println("index "+index);
		}
		
	}
}
