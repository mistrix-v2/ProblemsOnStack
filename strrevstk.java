import java.util.*;
public class strrevstk{
    public static String reverse(String str){
        Stack<Character> s =new Stack<>();
        int index=0;
        while(index<str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result =new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String st =sc.nextLine();
        String result= reverse(st);
        System.out.println(result);
    }
}