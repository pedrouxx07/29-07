package Bomdia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("-- Bem-vindo à loja Ferramentafacil -- ");
            System.out.println("Qual menu você deseja acessar");
            System.out.println("1 - Menu de Cadastro e Estoque");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção: ");
            int escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    listarparaestoque.loja1(teclado);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Use apenas números inteiros.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
