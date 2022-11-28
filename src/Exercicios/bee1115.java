package Exercicios;

import java.util.Scanner;
public class bee1115 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int X,Y;
        X = s.nextInt();
        Y = s.nextInt();
        while(X!=0 && Y!=0){
            if(X>0 && Y>0){
                System.out.println("primeiro");
            }else if(X<0 && Y>0){
                System.out.println("segundo");
            }else if(X < 0 && Y < 0){
                System.out.println("terceiro");
            }else if(X > 0 && Y < 0){
                System.out.println("quarto");
            }
            X = s.nextInt();
            Y = s.nextInt();
        }
    }
}
