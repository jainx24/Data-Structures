/* 
Balanced Brackets

A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:
	1.It contains no unmatched brackets.
	2.The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.

Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, print YES on a new line; otherwise, print NO on a new line.

*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class balancedbrackets{

    static String isBalanced(String str) {
        Stack<Character> s = new Stack<Character>();
        
        int i;
        
        for(i=0;i<str.length();i++)
        {
            if(!s.empty() && str.charAt(i)==')' && s.peek()=='(')
                s.pop();
            else if(!s.empty() && str.charAt(i)=='}' && s.peek()=='{')
                s.pop();
            else if(!s.empty() && str.charAt(i)==']' && s.peek()=='[')
                s.pop();
            
            else
                s.push(str.charAt(i));
        }
        
        return s.empty() ? "YES":"NO"; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}