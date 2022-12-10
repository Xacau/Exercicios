package Exercicios;

import java.util.Scanner;

public class bee1072{

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N, X, in, out;
        in = 0;
        out = 0;
        N = s.nextInt();

        for(int i = 0; i < N; i++){
            X = s.nextInt();
            if(X>=10 && X<=20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
