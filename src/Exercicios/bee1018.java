package Exercicios;

import java.util.Scanner;
public class bee1018 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int n, cem, cinquenta, vinte, dez, cinco, dois, um;
        n = s.nextInt();
        cem = n/100;
        cinquenta = (n%100)/50;
        vinte = ((n%100)%50)/20;
        dez = (((n%100)%50)%20)/10;
        cinco = ((((n%100)%50)%20)%10)/5;
        dois = (((((n%100)%50)%20)%10)%5)/2;
        um = ((((((n%100)%50)%20)%10)%5)%2)/1;
        System.out.println(n);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
    }
}
