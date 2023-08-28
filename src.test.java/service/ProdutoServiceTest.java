package service;

import dao.IProdutoDAO;
import dao.mock.ProdutoDaoMock;
import domain.Produto;
import exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.IProdutoService;
import services.ProdutoService;

import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.Assert.assertTrue;


public class ProdutoServiceTest {
    private IProdutoService produtoService;
    public Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setNome("item1");
        produto.setQuant(3);
        produto.setPreco(BigDecimal.TEN);

    }

    @Test
    public void pesquisarProdutoService() {
        Produto produtos = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtos);
    }

    @Test
    public void salvarProdutoService() throws TipoChaveNaoEncontradaException {
        Produto novoProduto = new Produto();
        novoProduto.setCodigo("B2");
        novoProduto.setNome("novoItem");
        novoProduto.setQuant(5);
        novoProduto.setPreco(BigDecimal.TEN);

        Boolean retorno = produtoService.cadastrar(novoProduto);
        assertTrue(retorno);
    }

    @Test
    public void excluirProdutoService() {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void atualizarProdutoService() throws TipoChaveNaoEncontradaException {
        produto.setNome("item2");
        produtoService.atualizar(produto);

        Assert.assertEquals("item2", produto.getNome());
    }

    @Test
    public void buscarTodosProdutoService() {
        Collection<Produto> list = produtoService.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() >= 1);

    }
}
