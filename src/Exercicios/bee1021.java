package Exercicios;

import java.util.Scanner;

public class bee1021 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int n, cem, cinquenta, vinte, dez, cinco, dois, um, moedaCinquenta, moedaVinte, moedaDez, moedaCinco, moedaUm;
        n = s.nextInt();
        cem = n/100;
        cinquenta = (n%100)/50;
        vinte = ((n%100)%50)/20;
        dez = (((n%100)%50)%20)/10;
        cinco = ((((n%100)%50)%20)%10)/5;
        dois = (((((n%100)%50)%20)%10)%5)/2;
        um = ((((((n%100)%50)%20)%10)%5)%2)/1;
        moedaCinquenta = ((((((((n%100)%50)%20)%10)%5)%2)%1)*100)/50;
        moedaVinte = (((((((((n%100)%50)%20)%10)%5)%2)%1)*100)%50)/25;
        moedaDez = ((((((((((n%100)%50)%20)%10)%5)%2)%1)*100)%50)%25)/10;
        moedaCinco = (((((((((((n%100)%50)%20)%10)%5)%2)%1)*100)%50)%25)%10)/5;
        moedaUm = ((((((((((((n%100)%50)%20)%10)%5)%2)%1)*100)%50)%25)%10)%5)/1;
        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(moedaCinquenta + " moeda(s) de R$ 0,50");
        System.out.println(moedaVinte + " moeda(s) de R$ 0,25");
        System.out.println(moedaDez + " moeda(s) de R$ 0,10");
        System.out.println(moedaCinco + " moeda(s) de R$ 0,05");
        System.out.println(moedaUm + " moeda(s) de R$ 0,01");
    }
}