package NotaFiscal;

import structs.structIV;
import PS.ProdutoServico;

public class NFBuilder {
    private NF nf;
    
    public void build(structIV sIV,String cpf,String nome) throws IllegalArgumentException{
        if (sIV == null||sIV.ps==null)throw new IllegalArgumentException("Lista de itens vazia");
        
        IV iv = new IV(sIV.ps,sIV.quantidade,sIV.desconto);
        nf = new NF(iv, nome, cpf);
    }
    
    public void buildValidada(NF nf,double total){
        this.nf = new NF(nf,total);
    }
    
    public NF getNF(){
        return nf;
    }
}
