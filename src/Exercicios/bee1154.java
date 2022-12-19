package Exercicios;

import java.util.Scanner;
public class bee1154 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int idade, cont;
        double media;
        media = 0;
        cont = 0;
        idade = s.nextInt();
        if(idade > 0){
            media += idade;
            cont++;
        }while(idade > 0){
            idade = s.nextInt();
            if(idade > 0){
                media += idade;
                cont++;
            }else if(idade < 0){
                break;
            }
        }
        media = (double) media/cont;
        System.out.printf("%.2f\n", media);
    }
}
