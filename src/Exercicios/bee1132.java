package Exercicios;

import java.util.Scanner;

public class bee1132{
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int X, Y, temp, soma;
        temp = 0;
        soma = 0;
        X = s.nextInt();
        Y = s.nextInt();
        if(X>Y){
            temp = X;
            X = 0;
            X = Y;
            Y = temp;
        }
        for(int i = X; i <= Y; i++){
            if(i%13!=0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
