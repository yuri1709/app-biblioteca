/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teca.service;

import java.util.Random;

/**
 *
 * @author Gamer
 */
public class RegistroLivro {
    public int registroLivro(int number){ //gera um número de registro do livro
        Integer registro;
        Random gerador = new Random();
        return gerador.nextInt(number);
    }
}
