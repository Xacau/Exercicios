package Exercicios;

import java.util.Scanner;

public class bee1079{
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int N;
        double X, Y, Z, media;
        N = s.nextInt();
        for(int i = 0; i < N; i++){
            X = s.nextDouble();
            Y = s.nextDouble();
            Z = s.nextDouble();
            media = ((X*2)+(Y*3)+(Z*5))/10.0;
            System.out.printf("%.1f\n",media);
        }
    }
}
