import java.util.*;
public class DerivativeCalculator {

	public static void main(String[] args) {
		
		System.out.println("Welcome to derivative calculator!");
		String function = takeInput();
		computeDerivative(function);
		
	}
	
	public static String takeInput() {
		Scanner input = new Scanner(System.in);
		String function = input.nextLine();	
		return function;
	}
	
	public static String computeDerivative(String function) {
		FunctionTree funcTree = new FunctionTree(function);
		return funcTree.computeFunctionDerivative();
	}
	
	
	
	
	
	
	
}
