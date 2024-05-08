package br.com.prime.java.io.IOBytes.IOObject;

import java.io.Serializable;

//nome, idade, cor;
public class Gato implements Serializable {

    private static final long serialVersionUID = 2L;
    private static String nome;
    private static Integer idade;
    private static String cor;
    private static boolean castrado;
    private static boolean ronrona;

    public Gato(){}

    public Gato(String nome, Integer idade, String cor, boolean castrado, boolean ronrona) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.castrado = castrado;
        this.ronrona = ronrona;
    }

    public static String getNome() {
        return nome;
    }

    public static Integer getIdade() {
        return idade;
    }

    public static String getCor() {
        return cor;
    }

    public static boolean isCastrado() {
        return castrado;
    }

    public static boolean isRonrona() {
        return ronrona;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", castrado=" + castrado +
                ", ronrona=" + ronrona +
                '}';
    }
}
