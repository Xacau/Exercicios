package Exercicios;

import java.util.Scanner;
public class bee1101 {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int M,N,temp,soma;
        soma = 0;
        M = s.nextInt();
        N = s.nextInt();
        if(M > N){
            temp = M;
            M = 0;
            M = N;
            N = temp;
        }
        for(int i = M; i <= N; i++){
            System.out.print(i + " ");
            soma += i;
        }
        System.out.print("Sum="+soma+"\n");
        while(M != 0 && N != 0){
            soma = 0;
            M = s.nextInt();
            N = s.nextInt();
            if(M == 0 || N == 0 || M < 0 || N < 0){
                break;
            }
            if(M > N){
                temp = M;
                M = 0;
                M = N;
                N = temp;
            }
            for(int i = M; i <= N; i++){
                System.out.print(i + " ");
                soma += i;
            }
            System.out.print("Sum="+soma+"\n");
        }
    }
}
