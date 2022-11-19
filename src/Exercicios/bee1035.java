package Exercicios;

import java.util.Scanner;
public class bee1035 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int A,B,C,D;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();
        if(B>C && D>A && (C+D)>(A+B) && C>0 && D>0 && A%2==0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
