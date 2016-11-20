package impostos;

import PS.ProdutoServico;
import java.util.List;

public abstract class ImpostosVisitor{
    protected List<ProdutoServico> _PS;
    protected ImpostoDataNF _ID;
    
    public void visit(ProdutoServico PS){
        _PS.add(PS);
    }
    
    public void setImpostoData(ImpostoDataNF ID){
        _ID = ID;
    }
    
    public abstract double calculaAliquotaPS();
    public abstract double calculaAliquotaNF(ImpostoDataNF infoNF);
}
