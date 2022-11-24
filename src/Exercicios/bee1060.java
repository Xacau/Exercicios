package Exercicios;

import java.util.Scanner;
public class bee1060{
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        double N, cont;
        cont = 0;
        for(int i = 0; i < 6; i++){
            N = s.nextDouble();
            if(N>0){
                cont++;
            }
        }
        System.out.printf("%.0f valores positivos\n", cont);
    }
}