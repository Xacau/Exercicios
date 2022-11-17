package Exercicios;

import java.util.Scanner;
public class bee1010 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int codPecaUm, numPecaUm, codPecaDois, numPecaDois;
        double valorPecaUm, valorPecaDois, total;
        codPecaUm = s.nextInt();
        numPecaUm = s.nextInt();
        valorPecaUm = s.nextDouble();
        codPecaDois = s.nextInt();
        numPecaDois = s.nextInt();
        valorPecaDois = s.nextDouble();
        total = (valorPecaUm * numPecaUm) + (valorPecaDois * numPecaDois);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
