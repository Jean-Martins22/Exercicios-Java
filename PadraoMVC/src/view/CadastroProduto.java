package view;

import controller.ProdutoController;
import model.Produto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroProduto {
    private JPanel panel1;
    private JTextField codigo;
    private JTextField nome;
    private JTextField preco;
    private JTextField qtd;
    private JButton btnEnviar;

    public CadastroProduto() {

        ProdutoController produtoController = new ProdutoController();
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Produto produto = new Produto(Integer.parseInt(codigo.getText()),
                        nome.getText(),
                        Double.parseDouble(preco.getText()),
                        Integer.parseInt(qtd.getText()));

                produtoController.inserir(produto);
                produtoController.listarProdutos();
                codigo.setText("");
                nome.setText("");
                preco.setText("");
                qtd.setText("");


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Produtos");
        frame.setContentPane(new CadastroProduto().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
    }
}
