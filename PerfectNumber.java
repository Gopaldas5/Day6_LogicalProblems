package com.bridgeLabz.Day6_LogicalProblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer you want to check :-  ");
        n = sc.nextInt();
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Given number is Perfect");
        }
        else
        {
            System.out.println("Given number is not Perfect ");
        }
    }
    int divisor(int x)
    {
        return x;
    }

}
