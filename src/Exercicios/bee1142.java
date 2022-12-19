package Exercicios;

import java.util.Scanner;

public class bee1142{
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int cont, N;
        N = s.nextInt();
        cont = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 4; j++){
                cont++;
                if(j == 3){
                    System.out.println("PUM");
                }else{
                    System.out.print(cont + " ");
                }
            }
        }
    }
}
