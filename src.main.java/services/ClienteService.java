package services;

import dao.IClienteDAO;
import services.generics.GenericService;
import domain.Cliente;

import java.io.Serializable;


public class ClienteService extends GenericService<Cliente, Serializable> implements IClienteService {

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }
}
