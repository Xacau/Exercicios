package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1043 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        double A,B,C,area,perimetro;
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        if((A+B)>C && (B+C)>A && (A+C)>B){
            perimetro = A+B+C;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        }else{
            area = ((A+B)*C)/2;
            System.out.printf("Area = %.1f\n",area);
        }
    }
}
