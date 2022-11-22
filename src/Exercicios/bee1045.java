package Exercicios;

import java.util.Scanner;
public class bee1045 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        double A, B, C, temp;
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        temp = 0;
        if(B > A && B > C && C > A){
            temp = A;
            A = 0;
            A = B;
            B = temp;
            temp = 0;
            temp = B;
            B = C;
            C = 0;
            C = temp;
        }else if(C > B && C > A && B > A){
            temp = A;
            A = 0;
            A = C;
            C = temp;
        }else if(B>A && B>=C){
            temp = A;
            A = 0;
            A = B;
            B = 0;
            B = temp;
        }else if(C > A && C >= B){
            temp = A;
            A = 0;
            A = C;
            C = 0;
            C = temp;
        }else if(B <= C && B < A){
            temp = C;
            C = 0;
            C = B;
            B = 0;
            B = temp;
        }
        if(A>=(B+C)){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if((A*A) == ((B*B)+(C*C))){
                System.out.println("TRIANGULO RETANGULO");
            }else if((A*A) > ((B*B)+(C*C))){
                System.out.println("TRIANGULO OBTUSANGULO");
            }else if((A*A) < ((B*B)+(C*C))){
                System.out.println("TRIANGULO ACUTANGULO");
            }
        }
        if(A == B && A == C){
            System.out.println("TRIANGULO EQUILATERO");
        }else if(A == B || A == C || B == C){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
