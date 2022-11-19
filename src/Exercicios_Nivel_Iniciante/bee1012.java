package Exercicios_Nivel_Iniciante;
import java.util.Scanner;
public class bee1012 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi;
        pi = 3.14159;
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();

        triangulo = (A*C)/2;
        circulo = pi*Math.pow(C,2);
        trapezio = ((A+B)*C)/2;
        quadrado = Math.pow(B,2);
        retangulo = A*B;

        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n",circulo);
        System.out.printf("TRAPEZIO: %.3f\n",trapezio);
        System.out.printf("QUADRADO: %.3f\n",quadrado);
        System.out.printf("RETANGULO: %.3f\n",retangulo);
    }
}
