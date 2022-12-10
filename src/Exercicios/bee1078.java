package Exercicios;

import java.util.Scanner;

public class bee1078{

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, total;
        N = s.nextInt();
        for(int i = 1; i <= 10; i++){
            total = N*i;
            System.out.println(i + " x " + N + " = " + total);
        }
    }
}
