package br.inatel.poo.cliente;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
