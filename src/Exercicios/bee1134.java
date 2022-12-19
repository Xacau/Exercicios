package Exercicios;

import java.util.Scanner;
public class bee1134 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int op, quantA, quantD, quantG;
        quantA = 0;
        quantD = 0;
        quantG = 0;
        op = s.nextInt();
        while(op!=4){
            if(op == 1){
                quantA++;
            }else if(op == 2){
                quantG++;
            }else if(op == 3){
                quantD++;
            }else if(op == 4){
                break;
            }
            op = s.nextInt();
        }
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + quantA);
            System.out.println("Gasolina: " + quantG);
            System.out.println("Diesel: " + quantD);
    }
}
