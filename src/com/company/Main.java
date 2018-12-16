package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
	    System.out.print("Введите число: ");
	    if (sc.hasNextInt())
        {
            int n = sc.nextInt();
            print(n);
        }
        else
        {
            System.out.println("Вы ввели не число.");
        }
    }

    public static void print(int n)
    {
        if (n > 1)
        {
            print(n-1);
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(n + " ");
        }
    }
}
