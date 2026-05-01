package MOCK;

import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name :");
        String Name = sc.nextLine();
         String reverse ="";
         for(int i = Name.length()-1;i>=0;i--){
             reverse = reverse+Name.charAt(i);
         }
        System.out.println("Reverse Name :"+reverse);
    }
}
