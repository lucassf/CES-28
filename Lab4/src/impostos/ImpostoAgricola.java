package impostos;

import PS.ProdutoServico;

public class ImpostoAgricola extends ImpostosVisitor{
    double aliquota = 0;
    
    @Override
    public double calculaAliquotaPS(){
        
        for(ProdutoServico iterator:_PS){
            if("Agricola".equals(iterator.getCategoriaTributaria())){
                aliquota = 0.5;
            }
            return aliquota;
        }
        return aliquota;
    }

    @Override
    public double calculaAliquotaNF(ImpostoDataNF infoNF) {
        return 0;
    }
}
