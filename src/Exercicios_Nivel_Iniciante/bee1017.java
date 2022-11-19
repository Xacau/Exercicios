package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1017 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int horas, velMedia, consumo;
        double gasto;
        consumo = 12;
        horas = s.nextInt();
        velMedia = s.nextInt();
        gasto = (double) (horas*velMedia)/consumo;
        System.out.printf("%.3f\n",gasto);
    }
}
