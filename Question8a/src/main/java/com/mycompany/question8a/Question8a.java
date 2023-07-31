
package com.mycompany.question8a;
import java.util.Scanner;
public class Question8a {

    public static void main(String[] args) {
        
        int n1,n2,div;
        
        Scanner n=new Scanner(System.in);
           
             System.out.println("Enter first number: ");
              n1=n.nextInt();
             System.out.println("Enter second number: ");
             n2=n.nextInt();
             
             try
             {
                div = n1/n2;
                 System.out.println("the answer is: "+div);
             }
             catch(Exception e)
             {
                 System.out.println("Divided by 0 error");
             }
}
}
