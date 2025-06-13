package basicPrograms;

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        int years,timescompund;
        double principle,rate,amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle :");
        principle = sc.nextDouble();
        System.out.println("enter years :");
        years = sc.nextInt();
        System.out.println("no of times compounded in a year :");
        timescompund = sc.nextInt();
        System.out.println("enter rate % : ");
        rate = sc.nextDouble() / 100;
        amount = principle * Math.pow(1 + rate / timescompund ,timescompund*years);
        sc.close();
        double a = Math.ceil(amount);
        System.out.printf("the amount after %d years to the nearest whole number is $ %.2f" ,years , a);
    }
}
