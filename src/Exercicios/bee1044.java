package Exercicios;

import java.util.Scanner;
public class bee1044 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int A,B;
        A = s.nextInt();
        B = s.nextInt();
        if(A%B==0 || B%A==0){
            System.out.println("Nao sao Multiplos");
        }else{
            System.out.println("Sao Multiplos");
        }
    }
}
