package br.com.dio;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DesafioBino {
    public static void main(String[] args) throws IOException {
       theon();
    }

    public static void theon(){
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int T , menor = 0, posMenor = 0;
        for ( int p=1; p<= N; p++) {
            System.out.println("Posicao:"+p);
            T = leitor.nextInt();
            if ( p == 1  ) {
                posMenor = p;
                menor = T;
            } else if (  T < menor  ) {
                posMenor = p;
                menor = T;
            }
        }
        System.out.println("Menor: "+posMenor);
    }

    public static void bino(){
        Scanner leitor = new Scanner(System.in);
        while (true) {
            System.out.println("hora: ");
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);

            switch ( hora  ) {
                case(7): System.out.println("Atraso maximo: " + min); break;
                case(8): System.out.println("Atraso maximo: " + (60 + min) ); break;
                case(9): System.out.println("Atraso maximo: " + (120 + min) ); break;
                default: System.out.println("Atraso maximo: 0");
            }
            if(!leitor.hasNext()) break;
        }
    }
}
