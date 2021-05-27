import java.util.Scanner;

public class Main {	
	String input;
	
	String getKey() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input: ");
		input = scan.next();
		
		return input;
	}
	
	int hashFunction(String key) {
		int output = 0;
		int M = 17;
		
		for(int i=0;i<input.length(); i++)
			output += key.charAt(i);
		
		output = output % M;
		
		return output;
	}

	public static void main(String[] args) {
		Main main = new Main();
		String key;
		int output;
		
		key = main.getKey();
		while(key != "-1") {
			output = main.hashFunction(key);
			System.out.println("output: " + output);
			
			key = main.getKey();
		}
	}
}
