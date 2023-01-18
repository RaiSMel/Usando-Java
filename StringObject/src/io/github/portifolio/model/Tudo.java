package io.github.portifolio.model;
import java.lang.*;
/**
 * Está classe apresenta um sistema para apresentar o nome junto a um Olá;
 * 
 * @version 1.8
 * @author Rai 
 */


public class Tudo {

    // public String nome; // nome é publico
    private String nome; // nome é privado
    // protected String nome; // nome é visivel para classes herdadas
    // String nome; // nome é package private, visivel apenas para classes dentro do package
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Tudo(String nome){
        this.nome = nome;
    }

    public String mandaOi(){
        return this.nome + ", Ola";
    }
}