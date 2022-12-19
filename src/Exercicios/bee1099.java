package Exercicios;

import java.util.Scanner;
public class bee1099 {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, X, Y, soma, temp;
        soma = 0;
        temp = 0;
        N = s.nextInt();
        for(int i = 0; i < N; i++){
            X = s.nextInt();
            Y = s.nextInt();
            if(X > Y){
                temp = X;
                X = 0;
                X = Y;
                Y = temp;
            }
            if(X%2!=0){
                X++;
            }
            while(X < Y){
                if(X%2!=0){
                    soma += X;
                }
                X++;
            }
            System.out.println(soma);
            soma = 0;
        }
    }
}
