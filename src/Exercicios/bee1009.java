package Exercicios;

import java.util.Scanner;
public class bee1009 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        String nome;
        double tVendas, comissao, salario, aReceber;
        nome = s.nextLine();
        salario = s.nextDouble();
        tVendas = s.nextDouble();
        comissao = 0.15*tVendas;
        aReceber = salario+comissao;
        System.out.printf("TOTAL = R$ %.2f\n", aReceber);
    }
}
