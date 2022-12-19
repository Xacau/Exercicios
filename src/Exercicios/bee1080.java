package Exercicios;

import java.util.Scanner;

public class bee1080{
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, pos, maior;
        pos = 0;
        maior = 0;
        for(int i = 1; i <= 100; i++){
            N = s.nextInt();
            if(N >= maior){
                pos = i;
                maior = N;
            }
        }
        System.out.println(maior);
        System.out.println(pos);
    }
}