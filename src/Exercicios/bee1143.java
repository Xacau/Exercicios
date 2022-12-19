package Exercicios;

import java.util.Scanner;
public class bee1143 {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
            System.out.print(i + " ");
            System.out.print((int)Math.pow(i,2) + " ");
            for(int j = 1; j <= 1; j++){
                System.out.print((int)Math.pow(i,3));
                System.out.println();
            }
        }
    }
}