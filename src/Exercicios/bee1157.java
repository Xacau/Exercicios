package Exercicios;

import java.util.Scanner;

public class bee1157{

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
            if((int)N%i==0){
                System.out.println(i);
            }
        }
    }
}
