package Exercicios;

import java.util.Scanner;
public class bee1006 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        double media = ((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f\n",media);
    }
}
