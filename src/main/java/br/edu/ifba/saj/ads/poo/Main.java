package br.edu.ifba.saj.ads.poo;

public class Main {
    public static void main(String[] args) {
        try {
            BancoDeUsuarios.autenticar("usuario1", "senha1");
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
