package br.inatel.poo.pcmania;

import java.util.Scanner;
import br.inatel.poo.cliente.Cliente;
import br.inatel.poo.computador.Computador;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Zezinho", "123.456.789-00");

        Computador promo1 = Computador.criarPromocao1();
        Computador promo2 = Computador.criarPromocao2();
        Computador promo3 = Computador.criarPromocao3();

        Computador[] carrinho = new Computador[10];
        int qtd = 0;

        int opcao;
        do {
            System.out.println("\nEscolha a promoção (1-Apple, 2-Samsung, 3-Dell, 0-Sair): ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: carrinho[qtd++] = promo1; break;
                case 2: carrinho[qtd++] = promo2; break;
                case 3: carrinho[qtd++] = promo3; break;
                case 0: break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        System.out.println("\n===== RESUMO DA COMPRA =====");
        cliente.mostrarInfo();

        double total = 0;
        for (int i = 0; i < qtd; i++) {
            carrinho[i].mostraPCConfigs();
            total += carrinho[i].getPreco();
        }
        System.out.println("TOTAL DA COMPRA: R$" + total);

        sc.close();
    }
}
