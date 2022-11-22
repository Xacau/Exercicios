package Exercicios;

import java.util.Scanner;
public class bee1046 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int horaIn, horaFim, duracao;
        horaIn = s.nextInt();
        horaFim = s.nextInt();
        duracao = 0;
        if(horaFim<12 || horaIn > 12 && horaFim > 12){
            duracao = (24 - horaIn) + horaFim;
        }else if(horaFim >= 12 && horaIn < 12){
            duracao = horaFim - horaIn;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
