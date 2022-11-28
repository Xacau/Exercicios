package Exercicios;

import java.util.Scanner;
public class bee1114 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int senha = s.nextInt();
        while(senha!=2002){
            System.out.println("Senha Invalida");
            senha = s.nextInt();
            if(senha==2002){
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}
