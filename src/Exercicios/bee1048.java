package Exercicios;

import java.util.Scanner;
public class bee1048 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        double salario, reajuste, percentual, porcentagem, salarioReajustado;
        salario = s.nextDouble();
        porcentagem = 0;
        salarioReajustado = 0;
        reajuste = 0;
        if(salario>=0 && salario<=400.00){
            percentual = 0.15;
            porcentagem = percentual*100;
            salarioReajustado += salario+(percentual*salario);
            reajuste = salarioReajustado - salario;
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%\n", porcentagem);
        }else if(salario >= 400.01 && salario <= 800.00){
            percentual = 0.12;
            porcentagem = percentual*100;
            salarioReajustado += salario+(percentual*salario);
            reajuste = salarioReajustado - salario;
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%\n", porcentagem);
        } else if (salario >= 800.01 && salario <= 1200.00) {
            percentual = 0.10;
            porcentagem = percentual*100;
            salarioReajustado += salario+(percentual*salario);
            reajuste = salarioReajustado - salario;
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%\n", porcentagem);
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            percentual = 0.07;
            porcentagem = percentual*100;
            salarioReajustado += salario+(percentual*salario);
            reajuste = salarioReajustado - salario;
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%\n", porcentagem);
        } else if (salario > 2000.00) {
            percentual = 0.04;
            porcentagem = percentual*100;
            salarioReajustado += salario+(percentual*salario);
            reajuste = salarioReajustado - salario;
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%\n", porcentagem);
        }
    }
}
