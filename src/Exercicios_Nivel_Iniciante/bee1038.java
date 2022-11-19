package Exercicios_Nivel_Iniciante;

import java.util.Scanner;
public class bee1038 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int codItem, quantItem;
        double aPagar = 0;
        codItem = s.nextInt();
        quantItem = s.nextInt();
        if(codItem == 1){
            aPagar = quantItem * 4;
        }else if(codItem == 2){
            aPagar = quantItem * 4.5;
        }else if(codItem == 3){
            aPagar = quantItem * 5;
        }else if(codItem == 4){
            aPagar = quantItem * 2;
        }else if(codItem == 5){
            aPagar = quantItem * 1.5;
        }
        System.out.printf("Total: R$ %.2f\n", aPagar);
    }
}
