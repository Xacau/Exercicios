package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1002 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double pi = 3.14159;
        double raio = s.nextDouble();
        double area = pi*Math.pow(raio,2);
        System.out.printf("A=%.4f\n",area);
    }
}
