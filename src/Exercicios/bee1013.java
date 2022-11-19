package Exercicios;

import java.util.Scanner;
public class bee1013 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int A, B, C, MaiorAB, MaiorABC;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();

        MaiorAB = (A+B+Math.abs(A-B))/2;
        MaiorABC = (MaiorAB+C+Math.abs(MaiorAB-C))/2;
        System.out.println(MaiorABC + " eh o maior");
    }
}