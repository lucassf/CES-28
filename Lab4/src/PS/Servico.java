package PS;

import impostos.ImpostosVisitor;
import structs.structServico;

public abstract class Servico extends ProdutoServico{
    private double precoHora;
    private String natureza;
    
    public Servico(structServico sServico){
        super(sServico.nome, sServico.associados,sServico.categoriaTributaria);
        this.precoHora = sServico.precoHora;
        this.natureza = sServico.natureza;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public String getNatureza() {
        return natureza;
    }

    @Override
    double getValor() {
        return precoHora;
    }

    @Override
    public void accept(ImpostosVisitor imposto) {
        imposto.visit(this);
    }

}