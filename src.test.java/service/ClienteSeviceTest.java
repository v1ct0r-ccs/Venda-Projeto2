package service;

import dao.mock.ClienteDaoMock;
import dao.IClienteDAO;
import domain.Cliente;
import exceptions.TipoChaveNaoEncontradaException;

import static org.junit.Assert.assertTrue;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import services.ClienteService;
import services.IClienteService;

import java.util.Collection;

public class ClienteSeviceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteSeviceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(1231321230L);
        cliente.setNome("Victor");
        cliente.setTel(654753951L);
        cliente.setEnd("asd");
        cliente.setNumero(3);
        cliente.setCidade("A Coruña");
        cliente.setEstado("GZ");


    }

    @Test
    public void bucarPorCPFService() {
        Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarService() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirService() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarService() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Victor Bruno");
        clienteService.atualizar(cliente);

        Assert.assertEquals("Victor Bruno", cliente.getNome());
    }

    @Test
    public void buscarTodosService() {
        Collection<Cliente> list = clienteService.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() >= 1);
    }


}
