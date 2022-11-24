package Exercicios;

import java.util.Scanner;
public class bee1066 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, par, impar, positivo, negativo;
        par = 0;
        impar = 0;
        positivo = 0;
        negativo = 0;
        for(int i = 0; i < 5; i++){
            N = s.nextInt();
            if(N%2==0 && N>0){
                par++;
                positivo++;
            }else if(N%2!=0 && N>0){
                impar++;
                positivo++;
            }else if(N%2==0 && N<0){
                par++;
                negativo++;
            }else if(N%2!=0 && N<0){
                impar++;
                negativo++;
            }else if(N == 0){
                par++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
