package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1036 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        double A,B,C, delta, R1,R2;
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        delta = Math.pow(B,2) - (4*A*C);
        if(A<=0 || delta<0){
            System.out.println("Impossivel calcular");
        }else{
            R1 = (-B + Math.sqrt(delta))/(2*A);
            R2 = (-B - Math.sqrt(delta))/(2*A);
            System.out.printf("R1 = %.5f\n",R1);
            System.out.printf("R2 = %.5f\n",R2);
        }
    }
}
