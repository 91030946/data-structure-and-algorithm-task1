/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionvalidation.java;
import java.util.*;
/**
 *
 * @author 91030946
 */
public class ExpressionValidationJava {
   private String parentheses;
    public ExpressionValidationJava(String s) {
            parentheses = s;
    }
    
    public static Scanner scanner = new Scanner(System.in);
    public static String input;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("Welcome to the program");
        System.out.println("Enter an expression you wish to validate: ");
        String input = scanner.nextLine();
        ExpressionValidationJava b = new ExpressionValidationJava(input);
        System.out.println("Entered expression: " + input + "\n" + "valid expression: " + b.validate());
    }
        // TODO code application logic here
                
    /**
     *
     * @return
     */
 
        public boolean validate(){
        boolean result = true;
        Stack<Character> stack = new Stack<Character>();
        char current, previous;
        for(int i = 0; i < this.parentheses.length(); i++) {
            current = this.parentheses.charAt(i);
            if(current == '(' || current == '[' || current == '{' || current == '<') {
                stack.push(current);
            } else if(current == ')' || current == ']' || current == '}' || current == '>') {
                if(stack.isEmpty()) {
                    result = false;
                } else {
                    previous = stack.peek();
                    if((current == ')' && previous == '(') || (current == ']' && previous == '[') || (current == '}' && previous == '{') || (current == '>' && previous == '<')) {
                        stack.pop();
                    } else {
                        result = false;
                    }
                }
            }
        }
        if(!stack.isEmpty()) {
            result = false;
        }
        return result;
    }
    
}
