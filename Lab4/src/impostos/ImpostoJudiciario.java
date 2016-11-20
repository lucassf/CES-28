package impostos;

import PS.ProdutoServico;

public class ImpostoJudiciario extends ImpostosVisitor{
    double aliquota = 0;
    
    
    @Override
    public double calculaAliquotaPS(){
        
        for(ProdutoServico iterator:_PS){
            if("Judiciario".equals(iterator.getCategoriaTributaria())){
                aliquota = 0.7;
            }
            return aliquota;
        }
        return aliquota;
    }
    
    @Override
    public double calculaAliquotaNF(ImpostoDataNF infoNF){
        if(infoNF._valorTotal > 500)
            aliquota = 0.1;
        return aliquota;
    }
}