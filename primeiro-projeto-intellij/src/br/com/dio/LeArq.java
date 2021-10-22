package br.com.dio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeArq {
    public static void main(String[] args) throws FileNotFoundException {
        recebeEntrada();
        System.out.print("Fim");
    }

    public static void recebeEntrada() throws FileNotFoundException {
        String aux;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome do arquivo: ");
        String nomeArq = scan.next();
        PrintWriter escritor = new PrintWriter(nomeArq + ".txt");
        try{
            while (true){
                System.out.print("Hora da Saída: ");
                aux = scan.next();
                if(!aux.equals("X")){
                    escritor.println(aux);
                }else{
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            escritor.close();
            System.out.print("Arquivo Fechado:");
        }


    }
}
