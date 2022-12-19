package Exercicios;

import java.util.Scanner;

public class bee1159{
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int X, soma;
        soma = 0;
        X = s.nextInt();
        for(int i = X; i < X+10; i++){
            if(i%2==0){
                soma += i;
            }
        }
        System.out.println(soma);
        while(X != 0){
            soma = 0;
            X = s.nextInt();
            if(X == 0){
                break;
            }
            for(int i = X; i < X+10; i++){
                if(i%2==0){
                    soma += i;
                }
            }
            System.out.println(soma);
        }
    }
}