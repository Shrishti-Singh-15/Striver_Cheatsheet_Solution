package String;

import java.util.Scanner;

public class Reverse_String {
    public static String reverseString(String s){
        String str[] = s.trim().split("\\s+");
        String out = "";
        for(int i=str.length-1; i>=0; i++){
            out += str[i] + " ";
        }
        return out + str[0];
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = new String();
        str = sc.next();
        String out = reverseString(str);
        System.out.println("The reverse String is: " + out);
    }
}
