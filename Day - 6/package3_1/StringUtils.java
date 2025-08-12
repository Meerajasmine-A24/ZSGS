package mypack;
import java.util.Stack;

public class StringUtils{
	
	public String  concat(String a,String b){
		StringBuilder result=new StringBuilder();
		result.append(a);
		result.append(" ");
		result.append(b);
		return result.toString();
	}
	
	public String reverse(String s){
		Stack<Character> stack=new Stack<>();
		String str=" ";
		for(int i=0;i<s.length();i++){
			stack.push(s.charAt(i));
		}
		while(!stack.isEmpty()){
			str+=stack.pop();
		}
		return str;
	}
	
	public int length(String s){
		return s.length();
	}
}
