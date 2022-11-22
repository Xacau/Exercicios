package Exercicios;

import java.util.Scanner;
public class bee1047 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int horaIn, horaFim, minIn, minFim, duracaoHora, duracaoMin;

        horaIn = s.nextInt();
        minIn = s.nextInt();
        horaFim = s.nextInt();
        minFim = s.nextInt();
        duracaoHora = 0;
        duracaoMin = 0;
        if(horaIn == horaFim && minIn == minFim){
            duracaoHora = 24+(horaIn-horaFim);
            duracaoMin = (minIn - minFim);
            System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMin + " MINUTO(S)");
        }else if(horaIn < horaFim && minIn < minFim){
            duracaoHora = horaFim - horaIn;
            duracaoMin = minFim - minIn;
            System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMin + " MINUTO(S)");
        }else if(horaIn > horaFim && minIn > minFim){
            duracaoHora = 24-(horaIn - horaFim);
            duracaoMin = 60-(minIn - minFim);
            System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMin + " MINUTO(S)");
        }else if(horaIn < horaFim && minIn > minFim){
            duracaoHora = 0;
            duracaoMin = 60-(minIn-minFim);
            System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMin + " MINUTO(S)");
        }
    }
}
