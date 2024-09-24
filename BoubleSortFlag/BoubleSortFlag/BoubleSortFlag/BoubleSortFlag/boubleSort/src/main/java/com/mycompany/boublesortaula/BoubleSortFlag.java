package com.mycompany.boublesortaula;

import java.util.Random;
import java.util.Scanner;

public class BoubleSortFlag {
    
    static int trocas=0;
    static int comparacoes=0;
    
    static void troca(Integer[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    static void bSort(Integer v[]){
         int n = v.length;
         boolean flag = true;
         
         while(flag){
             flag = false;
            for(int fase=1;fase<n;fase++){
                for(int j=0;j<n-fase;j++){
                    comparacoes++;
                    if(v[j]>v[j+1]){
                        trocas++;
                        flag = true;
                        troca(v,j,j+1);
                    }
                }
            }
         }
    }
    
    static Integer[] gerarVetor(int n, int max){
        Random rand = new Random();
        Integer[] vetor = new Integer[n];
        for(int i=0;i<n;i++){
            vetor[i] = rand.nextInt(max)+1;
        }
        return vetor;
    }
    
    static void mostrarvetor(Integer[] v){
        int tamanho = v.length;
        for(int i=0;i<tamanho;i++){
            System.out.print(v[i]+"|");
            System.out.print("");
        }
    }
    //-------------------------------------
    /*static void bSortComentado(Integer v[]){
        int n = v.length;
        for(int fase=1;fase<n;fase++){
            mostrarvetor(v);
            for(int j=0;j<n-fase;j++){
                System.out.printf("\n[%d]>[%d]\n", v[j],v[j+1]);
                comparacoes++;
                if(v[j]>v[j+1]){
                    System.out.println("trocou");
                    trocas++;
                    troca(v,j,j+1);
                    mostrarvetor(v);
                }//fim do if
            }//fim do for j
        }//fim do for i
    }*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Integer[] meuVetor = gerarVetor(10, 100);
        Integer[] meuVetor = new Integer[5];
        System.out.println("Dados para o vetor: ");
        for(int i=0;i<5;i++){
            meuVetor[i] = scan.nextInt();
        }
        System.out.println("Vetor Gerado");
        System.out.println("Antes: ");
        mostrarvetor(meuVetor);
        bSort(meuVetor);
        System.out.println("\nDepois: ");
        mostrarvetor(meuVetor);
        System.out.println("\nComparacoes: "+comparacoes);
        System.out.println("Trocas: "+trocas);
    }
}
