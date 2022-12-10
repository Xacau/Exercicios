package Exercicios;

import java.util.Scanner;

public class bee1075{

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N = s.nextInt();
        for(int i = 1; i < 10000; i++){
            if(i%N==2){
                System.out.println(i);
            }
        }
    }
}
