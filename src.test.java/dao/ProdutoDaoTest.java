package dao;

import dao.mock.ProdutoDaoMock;
import domain.Produto;
import exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ProdutoDaoTest {
    private IProdutoDAO produtoDAO;
    public Produto produto;
    public ProdutoDaoTest(){
        produtoDAO = new ProdutoDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setNome("item");
        produto.setQuant(5);
        produto.setPreco(BigDecimal.TEN);

        produtoDAO.cadastrar(produto);
    }

    @Test
    public void pesquisarProduto() {
        Produto produto = this.produtoDAO.consultar(this.produto.getCodigo());
        Assert.assertNotNull(produto);
    }

    @Test
    public void salvarProduto() throws TipoChaveNaoEncontradaException {
        produto.setCodigo("A2");
        Boolean retorno = produtoDAO.cadastrar(produto);
        assertTrue(retorno);
    }

    @Test
    public void excluirProduto() {
        produtoDAO.excluir(produto.getCodigo());
    }

    @Test
    public void atualizarProduto() throws TipoChaveNaoEncontradaException {
        produto.setNome("Item1");
        produtoDAO.alterar(produto);

        Assert.assertEquals("Item1", produto.getNome());
    }

    @Test
    public void buscarTodosProdutos() {
        Collection<Produto> list = produtoDAO.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() >= 1);
    }
}
