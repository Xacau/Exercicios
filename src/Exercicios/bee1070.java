package Exercicios;

import java.util.Scanner;
public class bee1070 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int X;
        X = s.nextInt();
        for(int i = 0; i < 6; i++){
            if(X%2!=0){
                System.out.println(X);
            }else if(X%2==0){
                ++X;
                System.out.println(X);
            }
            X+=2;
        }
    }
}
