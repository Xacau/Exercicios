package Exercicios;

import java.util.Scanner;
public class bee1051 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        double salario, aliquota23, aliquota34, aliquota5, imposto;
        salario = s.nextDouble();
        if(salario>=0 && salario <=2000.00){
            System.out.println("Isento");
        }else if(salario>=2000.01 && salario <= 3000.00){
            aliquota23 = 0.08;
            imposto = aliquota23*(salario-2000);
            System.out.printf("R$ %.2f\n",imposto);
        }else if(salario>=3000.01 && salario <= 4500.00){
            aliquota23 = 0.08;
            aliquota34 = 0.18;
            imposto = aliquota23*(1000)+aliquota34*(salario-3000);
            System.out.printf("R$ %.2f\n",imposto);
        }else if(salario > 4500.00){
            aliquota23 = 0.08;
            aliquota34 = 0.18;
            aliquota5 = 0.28;
            imposto = (aliquota23*(1000))+(aliquota34*(1500))+(aliquota5*(salario-4500));
            System.out.printf("R$ %.2f\n",imposto);
        }
    }
}
