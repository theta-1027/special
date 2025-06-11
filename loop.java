package basicPrograms;

import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int arr []= new int [n];
        for (int i = 0 ; i < n ; i ++)
        {
            System.out.println("enter number");
            arr [i]= sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("the sum of given numbers is"+sum);

    }
}