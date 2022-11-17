package Exercicios;

import java.util.Scanner;
public class bee1007 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int A,B,C,D;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();
        int DIFERENCA = (A*B-C*D);
        System.out.println("DIFEREtNCA = "+ DIFERENCA);
    }
}
