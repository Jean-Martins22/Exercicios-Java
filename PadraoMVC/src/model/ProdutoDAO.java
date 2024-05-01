package model;

import java.util.ArrayList;

public class ProdutoDAO {
//    Métodos de CRUD
//    C: CREATE R: READ = U: UPDATE D: DELETE

    ArrayList<Produto> produtos;

//    construtor
    public ProdutoDAO(){
        this.produtos = new ArrayList<>();
    }

//    métodos

    public void salvar(Produto p){
        produtos.add(p);

    }

    public ArrayList<Produto> listarProdutos(){
        return produtos;
    }

    public Produto alterar(int codigo, Produto p){
        for(int i=0; i < produtos.size(); i++){
            if(produtos.get(i).getCodigo() ==  codigo){
                produtos.set(i, p);
            }
        }
        return p;

    }

    public void remover(int codigo){
        for(int i=0; i < produtos.size(); i++){
            if (produtos.get(i).getCodigo() == codigo){
                produtos.remove(i);
            }
        }

    }

}
