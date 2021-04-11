package numbers;

public class CheckNumber {

	public static void main(String[] args) {

		String number = args[0];
		
		double result;
		
//		try {
//			result = Double.parseDouble(number);
//			System.out.println("Number: " + result);
//		}catch(Exception e) {
//			System.out.println("Input is not a number");
//		}
		
		processInput(number);

	}
	
	public static Number processInput(String input) {
		if(input.matches("[+-]*\\d*\\.\\d+[dDeEfF]*")) {
			try {
				double result = Double.parseDouble(input);
				System.out.println("Double is: " + result);
				return Double.valueOf(result);
			}catch(NumberFormatException e) {
				System.out.println("Input is not a number");
				return Double.NaN;
			}
		}else {
			try {
				int result = Integer.parseInt(input);
				System.out.println("Integer is: " + result);
				return Integer.valueOf(result);
			}catch(NumberFormatException e) {
				System.out.println("Input is not a integer");
				return Double.NaN;
			}
		}
	}

}
