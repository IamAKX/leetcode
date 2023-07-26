package leetcode.misc;

import java.util.Stack;

public class ParenthesisMatch {

	public static void main(String[] args) {
		String str = "](abc=num([)] {[1>19]}}";
		System.out.println(checkParenthesis(str));
	}

	private static boolean checkParenthesis(String str) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else if (!stack.isEmpty() && (c == '}' || c == ')' || c == ']')) {

				switch (c) {
				case '}':
					if (stack.peek() == '{')
						stack.pop();
					else
						return false;
					break;

				case ')':
					if (stack.peek() == '(')
						stack.pop();
					else
						return false;
					break;

				case ']':
					if (stack.peek() == '[')
						stack.pop();
					else
						return false;
					break;

				}
			}

		}
		return stack.isEmpty();

	}
}
