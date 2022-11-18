package Exercicios;

import java.util.Scanner;
public class bee1019 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N = s.nextInt();
        int horas = N/3600;
        int minutos = (N%3600)/60;
        int segundos = (N%60);
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
