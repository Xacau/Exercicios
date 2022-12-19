package Exercicios;

import java.util.Scanner;
public class bee1116{
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, X, Y;
        double resultado;
        N = s.nextInt();
        for(int i = 0; i < N; i++){
            X = s.nextInt();
            Y = s.nextInt();
            if(X>0 && Y!=0 || X < 0 &&  Y!= 0){
                resultado = (double) X/Y;
                System.out.printf("%.1f\n", resultado);
            }else if(Y == 0){
                System.out.println("divisao impossivel");
            }else if(X == 0){
                resultado = 0.0;
                System.out.printf("%.1f\n", resultado);
            }
        }
    }
}
