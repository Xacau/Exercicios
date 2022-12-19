package Exercicios;

import java.util.Scanner;

public class bee1074{
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N = s.nextInt();
        for(int i = 0; i < N; i++){
            int X = s.nextInt();
            if(X%2==0 && X > 0){
                System.out.println("EVEN POSITIVE");
            }else if(X%2!=0 && X > 0){
                System.out.println("ODD POSITIVE");
            }else if(X%2==0 && X < 0){
                System.out.println("EVEN NEGATIVE");
            }else if(X%2!=0 && X < 0){
                System.out.println("ODD NEGATIVE");
            }else if(X == 0){
                System.out.println("NULL");
            }
        }
    }
}