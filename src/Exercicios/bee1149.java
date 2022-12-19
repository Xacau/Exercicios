package Exercicios;

import java.util.Scanner;
public class bee1149 {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int A, N, soma;
        soma = 0;
        A = s.nextInt();
        N = s.nextInt();
        if(N<=0){
            N = s.nextInt();
            while(N <= 0){
                N = s.nextInt();
            }
        }
        for(int i = 0; i < N; i++){
            soma += A+i;
        }
        System.out.println(soma);
    }
}
