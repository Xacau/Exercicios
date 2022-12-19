package Exercicios;

import java.util.Scanner;
public class bee1153 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, resp;
        resp = 1;
        N = s.nextInt();
        for(int i = 1; i <= N; i++){
            resp *= i;
        }
        System.out.println(resp);
    }
}
