package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1014 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int X = s.nextInt();
        double Y = s.nextDouble();
        double consumo = (double) X/Y;
        System.out.printf("%.3f km/l\n",consumo);
    }
}
