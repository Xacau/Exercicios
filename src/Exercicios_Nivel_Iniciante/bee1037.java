package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1037 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        double A = s.nextDouble();
        if(A>=0 && A<=25.0000){
            System.out.println("Intervalo [0,25]");
        }else if(A>=25.00001 && A<=50.0000000){
            System.out.println("Intervalo (25,50]");
        }else if(A>=50.00001 && A<=75.0000000){
            System.out.println("Intervalo (50,75]");
        }else if(A>=75.00001 && A<=100){
            System.out.println("Intervalo (75,100]");
        }else if(A<0 || A>100){
            System.out.println("Fora de intervalo");
        }
    }
}
