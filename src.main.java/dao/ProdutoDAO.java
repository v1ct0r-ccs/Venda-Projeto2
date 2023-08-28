package dao;

import dao.generics.GenericDAO;
import domain.Produto;

public abstract class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {
/*
    public ProdutoDAO() {
        super();
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setPreco(entity.getPreco());
        entityCadastrado.setQuant(entity.getQuant());
    }

    @Override
    public void excluir(Serializable valor) {

    }

    @Override
    public Produto consultar(Serializable valor) {
        return super.consultar(valor);
    }*/
}
