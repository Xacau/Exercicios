package Exercicios;

import java.util.Scanner;

public class bee1144{

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int N, cont;
        N = s.nextInt();
        cont = 1;
        for(int i = 1; i <= N*2; i++){
            for(int j = 0; j < 3; j++){
                if( j == 0){
                    System.out.print(cont + " ");
                }if(i % 2 != 0 && j == 1){
                    System.out.print((int) Math.pow(cont,2) + " ");
                }else if(i % 2 != 0 && j == 2){
                    System.out.print((int) Math.pow(cont,3) + "\n");
                }else if(i % 2 == 0 && j == 1){
                    System.out.print((int) Math.pow(cont,2)+1 + " ");
                }else if(i % 2 == 0 && j == 2){
                    System.out.print((int) Math.pow(cont,3)+1 + "\n");
                }
            }
            if(i%2==0){
                cont++;
            }
        }
    }
}
