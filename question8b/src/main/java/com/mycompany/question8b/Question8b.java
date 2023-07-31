package com.mycompany.question8b;

import java.util.Scanner;

public class Question8b {

    public static void main(String[] args) 
    {
        Scanner N=new Scanner(System.in);
        System.out.println("Enter total number of arry:");
       int  a=N.nextInt();
       int arr[]=new int[a];
       
       for(int i=0;i<a;i++)
       {
           System.out.println("Enter element of index index:"+i+":");
           arr[i]=N.nextInt();
       }
        System.out.println("Enter the index you wanna see:");
        int value=N.nextInt();
       try
       {    
            int index = arr[value];
           System.out.println("the value of index is:"+index);
       }
       catch(Exception e)
       {
           System.out.println("The array index is not valid");
       }
       
       
    }
}
