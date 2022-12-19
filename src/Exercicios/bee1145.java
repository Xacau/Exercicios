package Exercicios;

import java.util.Scanner;
public class bee1145 {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int X, Y,cont;
        X = s.nextInt();
        Y = s.nextInt();
        cont = 1;
        for(int i = 1; i <= Y/X; i++){
            for(int j = 0; j < X; j++){
                if(j < X-1){
                    System.out.print(cont + " ");
                }else{
                    System.out.print(cont + "\n");
                }
                cont++;
            }
        }
    }
}
