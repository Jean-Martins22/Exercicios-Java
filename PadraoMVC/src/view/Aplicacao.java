package view;

import java.util.Scanner;
import controller.ProdutoController;
import model.Produto;

import javax.swing.*;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int opcao = 0;
        ProdutoController pController = new ProdutoController();

        while(opcao != 5) {

            System.out.println("-----------Marktplace----------");
            System.out.println("1: Escolha essa opção para cadastrar produto");
            System.out.println("2: Escolha essa opção para alterar produto");
            System.out.println("3: Escolha essa opção para listar produtos");
            System.out.println("4: Escolha essa opção para remover um produto");
            System.out.println("5: Escolha essa opção para sair");
            opcao = src.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("CADASTRO DE PRODUTOS\n");
                    System.out.println("Digite o codigo");
                    int codigo = src.nextInt();
                    System.out.println("Digite o nome");
                    src.nextLine();
                    String nome = src.nextLine();
                    System.out.println("Digite o preço");
                    double preco = src.nextDouble();
                    System.out.println("Digite a quantidade");
                    int qtd = src.nextInt();

                    pController.inserir(new Produto(codigo, nome, preco, qtd));
                    break;
                }
                case 2: {
                    System.out.println("ALTERAÇÃO DE PRODUTOS\n");
                    System.out.println("Digite o codigo");
                    int codigo = src.nextInt();
                    System.out.println("Digite o nome");
                    src.nextLine();
                    String nome = src.nextLine();
                    System.out.println("Digite o preço");
                    double preco = src.nextDouble();
                    System.out.println("Digite a quantidade");
                    int qtd = src.nextInt();

                    pController.alterar(codigo, new Produto(codigo, nome, preco, qtd));
                    break;
                }
                case 3: {
                    System.out.println("LISTAGEM DE PRODUTOS\n");
                    pController.listarProdutos();
                    break;
                }
                case 4: {
                    System.out.println("REMOÇÃO DE PRODUTOS\n");
                    System.out.println("Digite o codigo");
                    int codigo = src.nextInt();

                    pController.deletar(codigo);

                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Saindo do programa!");
                }
            }
        }




    }
}
