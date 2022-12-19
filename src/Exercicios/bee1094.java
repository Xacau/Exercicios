package Exercicios;

import java.util.Scanner;

public class bee1094{

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, Quantia, total, C, R, S;
        double percentC, percentR, percentS;
        char Tipo;
        total = 0;
        C = 0;
        R = 0;
        S = 0;
        N = s.nextInt();
        for(int i = 0; i < N; i++){
            Quantia = s.nextInt();
            total += Quantia;
            Tipo = s.next().charAt(0);
            if(Tipo == 'C'){
                C += Quantia;
            }else if(Tipo == 'R'){
                R += Quantia;
            }else if(Tipo == 'S'){
                S += Quantia;
            }
        }

        percentC = (double) (C*100.0)/total;
        percentR = (double) (R*100.0)/total;
        percentS = (double) (S*100.0)/total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + C);
        System.out.println("Total de ratos: " + R);
        System.out.println("Total de sapos: " + S);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentC);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentR);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentS);
    }
}
