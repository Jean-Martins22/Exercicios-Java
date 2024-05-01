package controller;

import model.Produto;
import model.ProdutoDAO;

import javax.swing.*;
import java.util.ArrayList;


public class ProdutoController {

    private ProdutoDAO pDao;

    public ProdutoController(){
        this.pDao = new ProdutoDAO();

    }

    public void inserir(Produto p){
        pDao.salvar(p);
        JOptionPane.showMessageDialog(null,
                "Produto inserido com sucesso!");

    }

    public void listarProdutos(){
        ArrayList<Produto> p = pDao.listarProdutos();
        for(int i=0; i < p.size(); i++){
            System.out.println("Codigo: " + p.get(i).getCodigo());
            System.out.println("Nome: " + p.get(i).getNome());
            System.out.println("Preco: " + p.get(i).getPreco());
            System.out.println("---------------------------------");
        }

    }

    public void alterar(int codigo, Produto p){
        if(codigo > 0)
            pDao.alterar(codigo, p);
        else
            JOptionPane.showMessageDialog(null,
                    "Impossivel alterar produto com código invalido!");


    }

    public void deletar(int codigo){
        if(codigo > 0)
            pDao.remover(codigo);
        else
            JOptionPane.showMessageDialog(null,
                    "Impossivel remover produto com código invalido ");

    }


}
