package Exercicios;

import java.util.Scanner;
public class bee1049 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        String palavraUm, palavraDois, palavraTres;
        palavraUm = s.nextLine();
        if(palavraUm.equals("vertebrado")){
            palavraDois = s.nextLine();
            if(palavraDois.equals("ave")){
                palavraTres = s.nextLine();
                if(palavraTres.equals("carnivoro")){
                    System.out.println("aguia");
                }else if(palavraTres.equals("onivoro")){
                    System.out.println("pomba");
                }
            }else if(palavraDois.equals("mamifero")){
                palavraTres = s.nextLine();
                if(palavraTres.equals("onivoro")){
                    System.out.println("homem");
                } else if (palavraTres.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }else if(palavraUm.equals("invertebrado")){
            palavraDois = s.nextLine();
            if(palavraDois.equals("inseto")){
                palavraTres = s.nextLine();
                if(palavraTres.equals("hematofago")){
                    System.out.println("pulga");
                } else if (palavraTres.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (palavraDois.equals("anelideo")) {
                palavraTres = s.nextLine();
                if(palavraTres.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if(palavraTres.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}
