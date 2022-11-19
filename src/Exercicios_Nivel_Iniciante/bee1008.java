package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1008 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int numFunc = s.nextInt();
        int horas = s.nextInt();
        double salarioHora = s.nextDouble();
        double salario = salarioHora * horas;
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    }
}
