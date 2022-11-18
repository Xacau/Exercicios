package Exercicios;

import java.util.Scanner;
public class bee1020 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int n = s.nextInt();
        int anos = n/365;
        int meses = (n%365)/30;
        int dias = (n%365)%30;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
