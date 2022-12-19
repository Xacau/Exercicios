package Exercicios;

import java.util.Scanner;
public class bee1118 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int op;
        double nUm, nDois, media;
        media = 0.0;
        nUm = s.nextDouble();
        while(nUm < 0 || nUm > 10.0) {
            System.out.println("nota invalida");
            nUm = s.nextDouble();
        }
        media += nUm;
        nDois = s.nextDouble();
        while(nDois < 0 || nDois > 10.0){
            System.out.println("nota invalida");
            nDois = s.nextDouble();
        }
        media += nDois;
        media = media/2;
        System.out.printf("media = %.2f\n", media);
        System.out.println("novo calculo (1-sim 2-nao)");
        op = s.nextInt();
        while(op < 1 || op > 2){
            System.out.println("novo calculo (1-sim 2-nao)");
            op = s.nextInt();
        }
        while(op == 1){
            media = 0.0;
            nUm = s.nextDouble();
            while(nUm < 0 || nUm > 10.0) {
                System.out.println("nota invalida");
                nUm = s.nextDouble();
            }
            media += nUm;
            nDois = s.nextDouble();
            while(nDois < 0 || nDois > 10.0){
                System.out.println("nota invalida");
                nDois = s.nextDouble();
            }
            media += nDois;
            media = media/2;
            System.out.printf("media = %.2f\n", media);
            System.out.println("novo calculo (1-sim 2-nao)");
            op = s.nextInt();
            while(op < 1 || op > 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                op = s.nextInt();
            }
            if(op == 2){
                break;
            }
        }
    }
}
