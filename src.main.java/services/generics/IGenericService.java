package services.generics;

import domain.Persistente;
import exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService<T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void atualizar(T entity) throws TipoChaveNaoEncontradaException;
    public void excluir(E valor);
    public T consultar(E valor);
    public Collection<T> buscarTodos();

}
