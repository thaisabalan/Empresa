/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empresa;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Empresa {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
        Cep cep = new Cep();
        
        System.out.println("Digite seu CEP:");
        cep.consultaCep(teclado.next());
        
        System.out.println(cep.bairro);
        System.out.println(cep.cep);
        System.out.println(cep.cidade);
        System.out.println(cep.logradouro);
        System.out.println(cep.uf);
        
    }
}
