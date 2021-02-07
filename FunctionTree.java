import java.util.*;

public class FunctionTree {

	Node head;	
	
	public FunctionTree(String function) {
		
		/*
		 * Take "function" and make it into a tree
		 */
		setFunctionOfTree(function);
		
	}
	
	public String computeFunctionDerivative() {
		
		String derivative = "";
		
		/*
		 * compute...
		 */
		
		
		return derivative;
	}
	
	public void setFunctionOfTree(String function) {
		
		/*
		 * Take "function" and make it into a tree
		 */
		function = inFixToPostFix(function);
		System.out.println(function);
		
		Stack<Node> trees = new Stack<Node>();
		for (int i = 0; i < function.length(); i++) {
			
			
			
		}
		
		
		
		
		
	}
	
	public String inFixToPostFix(String function) {
		
		String postFixFunction = "";
		Stack<String> elements = new Stack<>();
		Map<String, Integer> priorities = new HashMap<>();
		priorities.put("+", 1);
		priorities.put("-", 1);
		priorities.put("(", 0);
		priorities.put(")", 4);
		priorities.put("*", 2);
		priorities.put("/", 2);
		priorities.put("sin", 2);
		priorities.put("cos", 2);
		priorities.put("tan", 2);
		priorities.put("log", 2);
		priorities.put("ln", 2);
		priorities.put("^", 3);
		for (int i = 0; i < function.length(); i++) {
			String curr = function.charAt(i) + "";
			
			/*
			 * program in weird functions like sinx and lnx
			 */
			
			
		
			if (curr.equals(" ")) { 
				continue;
			} else if (!(curr.equals("^") || curr.equals("(") || curr.equals(")") || curr.equals("+") || curr.equals("-") || curr.equals("/") || curr.equals("*"))) {
				//if curr is a number
				postFixFunction += curr + " ";
			} else if (elements.isEmpty()) {
				elements.push(curr);
			} else if (curr.equals("(")) {
				elements.push(curr);
			} else if (priorities.get(curr + "") > priorities.get(elements.peek())) {
				elements.push(curr);
			} else if (priorities.get(curr) <= priorities.get(elements.peek())) {
				//curr has equal or lower priority than element on top of stack
				
				//pop off elements of stack until the element on top has lower priority than curr
				while (!elements.isEmpty() && priorities.get(elements.peek()) >= priorities.get(curr)) {
					postFixFunction += elements.pop() + " ";
				}
				
				if (!curr.equals(")")) {
					elements.push(curr);
				}
				
			}
			
		}
		
		//we've reached the end of the function. pop off all remaining elements from the stack and on to the postFix function
		while (!elements.isEmpty()) {
			postFixFunction += elements.pop() + " ";
		}
		
		return postFixFunction;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
