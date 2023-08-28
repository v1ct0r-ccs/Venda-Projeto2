package services.generics;

import dao.IProdutoDAO;
import dao.generics.IGenericDAO;
import domain.Persistente;
import exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public abstract class GenericService<T extends Persistente, E extends Serializable>
        implements IGenericService<T, E> {

    protected IGenericDAO<T, E> genericDAO;
    protected GenericService(IGenericDAO<T, E> dao) {
        this.genericDAO = dao;
    }

    protected GenericService(IProdutoDAO dao) {
        this.genericDAO = (IGenericDAO<T, E>) dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return this.genericDAO.cadastrar(entity);
    }

    @Override
    public void atualizar(T entity) throws TipoChaveNaoEncontradaException {
        this.genericDAO.alterar(entity);
    }

    @Override
    public void excluir(E valor) {
        this.genericDAO.excluir(valor);
    }

    @Override
    public T consultar(E valor) {
        return this.genericDAO.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.genericDAO.buscarTodos();
    }

}
