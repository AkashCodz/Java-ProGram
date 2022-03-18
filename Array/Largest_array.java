package Array;

import java.util.Scanner;

public class Largest_array {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        int temp, size,max=arr[0];
        
        System.out.println("Enter elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }       

        for (int i=1;i<n;i++)
         {if (arr[i] > max)
              max = arr[i];}
      System.out.print("Largest element is:: " +max); 
        System.out.println("");
}
}