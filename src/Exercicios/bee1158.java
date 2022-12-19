package Exercicios;

import java.util.Scanner;

public class bee1158{

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, X, Y, soma;
        soma = 0;
        N = s.nextInt();
        for(int i = 0; i < N; i++){
            X = s.nextInt();
            Y = s.nextInt();
            for(int j = X; j < X+(2*Y); j++){
                if(j%2!=0){
                    soma += j;
                }
            }
            System.out.println(soma);
            soma = 0;
        }
    }
}
