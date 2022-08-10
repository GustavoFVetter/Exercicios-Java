/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NumerosBingo;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Gustavo F. Vetter 10/08/2022
 */
public class Main {

    
    public static void main(String[] args) {
        // Construindo um ArrayList para Números Sorteados
        ArrayList<String> numeros = new ArrayList<>();
        int maior = 0;
        int menor = 0;
        double n = 0;
           
        
        // Criando um leitor para entrada de dados
        Scanner leitor = new Scanner (System.in);
        
        //Adicionar números sorteados ao ArrayList 
        System.out.println("Informe o nr. sorteado. Para encerrar, digite"
                    + " -1");
               
        for (int contador = 0; contador < 10;){
            
            numeros.add(leitor.nextLine());
            //if (numeros.equals(-1)){
            //break;
        
            contador++;
        }    
           
        leitor.close();
        System.out.println(numeros);
        
    }
}



    


