package dao;

import dao.generics.GenericDAO;
import domain.Cliente;

import java.io.Serializable;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setTel(entity.getTel());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setEstado(entity.getEstado());
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void excluir(Serializable valor) {

    }

    @Override
    public Cliente consultar(Serializable valor) {
        return null;
    }
}
