package Bomdia;

import java.util.ArrayList;
import java.util.Scanner;

public class listarparaestoque {

    private static ArrayList<estoque> listaEstoque = new ArrayList<>();

    public static void loja1(Scanner teclado) {
        int opcao;

        do {
            System.out.println("\n--- Menu de listagem ---");
            System.out.println("1. Cadastrar ferramenta");
            System.out.println("2. Lista de ferramentas");
            System.out.println("3. Atualizar quantidade");
            System.out.println("4. estoque ");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: cadastrar(teclado); break;
                case 2: listar(); break;
                case 3: atualizar(teclado); break;
                case 4: verificarEstoqueBaixo(); break;
                case 0: System.out.println("Voltando"); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void cadastrar(Scanner teclado) {
        teclado.nextLine(); 
        System.out.print("Tipo (Manual/Elétrica): ");
        String tipo = teclado.nextLine();
        System.out.print("Nome da ferramenta: ");
        String nome = teclado.nextLine();
        System.out.print("Quantidade: ");
        int qtd = teclado.nextInt();
        System.out.print("Valor unitário: ");
        double valor = teclado.nextDouble();

        estoque novaFerramenta = new estoque(tipo, nome, qtd, valor);
        listaEstoque.add(novaFerramenta);
        System.out.println("Ferramenta cadastrada!");
    }

    public static void listar() {
        System.out.println("\n--- Ferramentas Cadastradas ---");
        if (listaEstoque.isEmpty()) {
            System.out.println("Nenhuma ferramenta cadastrada.");
        } else {
            for (estoque e : listaEstoque) {
                System.out.println(e);
            }
        }
    }

    public static void atualizar(Scanner teclado) {
        teclado.nextLine();
        System.out.print("Digite o nome da ferramenta para atualizar: ");
        String nome = teclado.nextLine();

        for (estoque e : listaEstoque) {
            if (e.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Nova quantidade: ");
                int novaQtd = teclado.nextInt();
                e.setQuantidade(novaQtd);
                System.out.println("Estoque atualizado!");
                return;
            }
        }

        System.out.println("Ferramenta não encontrada.");
    }

    public static void verificarEstoqueBaixo() {
        System.out.println("\n--- estoque  ---");
        for (estoque e : listaEstoque) {
            if (e.getQuantidade() < 7) {
                System.out.println(e);
            }
        }
    }
    
}
