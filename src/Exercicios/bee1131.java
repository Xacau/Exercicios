package Exercicios;

import java.util.Scanner;
public class bee1131 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int grenal, inter, gremio, empate, op, golIn, golGr;
        grenal = 0;
        inter = 0;
        gremio = 0;
        empate = 0;
        grenal++;
        golIn = s.nextInt();
        golGr = s.nextInt();
        if(golIn > golGr){
            inter++;
        }else if(golIn < golGr){
            gremio++;
        }else if(golIn == golGr){
            empate++;
        }
        System.out.println("Novo grenal (1-sim 2-nao)");
        op = s.nextInt();
        while(op == 1){
            grenal++;
            golIn = s.nextInt();
            golGr = s.nextInt();
            if(golIn > golGr){
                inter++;
            }else if(golIn < golGr){
                gremio++;
            }else if(golIn == golGr){
                empate++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            op = s.nextInt();
            if(op==2){
                System.out.println(grenal + " grenais");
                System.out.println("Inter:" + inter);
                System.out.println("Gremio:" + gremio);
                System.out.println("Empates:" + empate);
                if(inter>gremio){
                    System.out.println("Inter venceu mais");
                }else{
                    System.out.println("Gremio venceu mais");
                }
                break;
            }
        }
    }
}
