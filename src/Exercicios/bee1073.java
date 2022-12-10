package Exercicios;

import java.util.Scanner;

public class bee1073{

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, pot;
        N = s.nextInt();
        for(int i = 1 ; i <= N; i++){
            if(i%2==0){
                pot = (int) Math.pow(i,2);
                System.out.println(i+"^"+"2 = "+pot);
            }
        }
    }
}
