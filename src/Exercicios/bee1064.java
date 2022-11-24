package Exercicios;

import java.util.Scanner;
public class bee1064 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        double a, cont, media;
        cont = 0;
        media = 0;
        for(int i = 0; i < 6; i++){
            a = s.nextDouble();
            if(a>0) {
                cont++;
                media += a;
            }
        }
        media = media/cont;
        System.out.printf("%.0f valores positivos\n", cont);
        System.out.printf("%.1f\n", media);
    }
}
