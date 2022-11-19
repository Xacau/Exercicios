package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1005 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double A = s.nextDouble();
        double B = s.nextDouble();
        double media = ((A*3.5)+(B*7.5))/11;
        System.out.printf("MEDIA = %.5f\n",media);
    }
}
