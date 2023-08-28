package services;

import dao.IProdutoDAO;
import domain.Produto;
import services.generics.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
    public ProdutoService(IProdutoDAO produtoDAO) {
        super(produtoDAO);
    }

}
