package Exercicios;

import java.util.Scanner;
public class bee1042 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int A,B,C;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        if(A<B && A<C && B<C){
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        }else if(A<B && A<C && C<B){
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);
        }else if(B<A && B<C && A<C){
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);
        }else if(B<A && B<C && C<A){
            System.out.println(B);
            System.out.println(C);
            System.out.println(A);
        }else if(C<A && C<B && A<B){
            System.out.println(C);
            System.out.println(A);
            System.out.println(B);
        }else if(C<A && C<B && B<A){
            System.out.println(C);
            System.out.println(B);
            System.out.println(A);
        }
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
