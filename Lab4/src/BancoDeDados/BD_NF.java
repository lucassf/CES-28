package BancoDeDados;

import NotaFiscal.NF;
import NotaFiscal.NFBuilder;

enum BD_NF {
    INSTANCE;
    NF validarNF(NF nf){
        //if (!validarPrefeitura(nf))return null;
        
        NFBuilder nfbuilder = new NFBuilder();
        nfbuilder.buildValidada(nf, 0);
        return nfbuilder.getNF();
    }
    
    //protected abstract boolean validarPrefeitura(NF nf);
    
}
