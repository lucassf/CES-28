package PS;

import impostos.ImpostosVisitor;
import structs.structProduto;


public abstract class Produto extends ProdutoServico{
    private double precoUnidade;
    private String materiaPrima;
    
    public Produto(structProduto sproduto){
        super(sproduto.nome, sproduto.associados,sproduto.categoriaTributaria);
        this.precoUnidade = sproduto.precoUnidade;
        this.materiaPrima = sproduto.materiaPrima;
    }
    
    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public String getMateriaPrima() {
        return materiaPrima;
    }

    @Override
    double getValor() {
        return precoUnidade;
    }

    public void accept(ImpostosVisitor imposto) {
        imposto.visit(this);
    }
}
