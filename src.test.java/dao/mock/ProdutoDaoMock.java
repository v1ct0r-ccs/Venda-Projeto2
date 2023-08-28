package dao.mock;

import dao.IProdutoDAO;
import domain.Produto;
import exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProdutoDaoMock implements IProdutoDAO {

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Serializable valor) {

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Produto consultar(Long valor) {
        Produto produto = new Produto();
        produto.setCodigo(String.valueOf(valor));
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto());
        produtos.add(new Produto());
        return produtos;
    }

    @Override
    public Produto consultar(Serializable valor) {
        Produto produto = new Produto();
        produto.setCodigo((String) valor);
        return produto;
    }
}
