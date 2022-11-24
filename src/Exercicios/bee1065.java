package Exercicios;

import java.util.Scanner;
public class bee1065 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, cont;
        cont = 0;
        for(int i = 0; i < 5 ; i++){
            N = s.nextInt();
            if(N%2==0){
                cont++;
            }
        }
        System.out.println(cont + " valores pares");
    }
}
