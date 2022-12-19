package Exercicios;

import java.util.Scanner;
public class bee1146 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int X;
        do{
            X = s.nextInt();
            for(int i = 1; i <= X; i++){
                if(i <= X-1){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + "\n");
                }
            }
        }while(X!=0);
    }
}
