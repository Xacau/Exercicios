package Exercicios;

import java.util.Scanner;
public class bee1071{
    public static Scanner s  = new Scanner(System.in);
    public static void main(String[] args){
        int X,Y,temp,soma;
        X = s.nextInt();
        Y = s.nextInt();
        temp = 0;
        soma = 0;
        if(Y<X){
            temp = X;
            X = 0;
            X = Y;
            Y = temp;
        }
        if(X%2!=0){
            X++;
        }
        while(X<Y){
            if(X%2!=0){
                soma += X;
            }
            X++;
        }
        System.out.println(soma);
    }
}