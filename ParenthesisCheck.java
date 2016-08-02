import java.util.Scanner;
import java.util.Stack;
import java.lang.String;

public class ParenthesisCheck{

    static Stack<String> stack;
   static String char1;
	
    public static void main(String[] args){

         stack = new Stack<String>();
         Scanner scan = new Scanner(System.in);
         char1 = scan.next();

        System.out.println("input:" + char1 + "is" + check(char1));

    }



    public static boolean check(String str){
    	 String[] strArray = char1.split("");

    	  for(int i=0; i<strArray.length; i++){
                if(strArray[i] == "(" || strArray[i] == "{" || strArray[i] == "["){
                        stack.push(strArray[i]);
                    }
                }
                    	for (int j=0; j<strArray.length; j++) {
                    		if ((strArray[j] == ")" && stack.peek()=="(") || (strArray[j] == "}" && stack.peek()=="{") || (strArray[j] == "]" && stack.peek()=="[")){
				stack.pop();
			}
			              	}
			            

		if (stack.empty() == true){
			return true;
		}
		else{
			return false;
	}
                }
        }