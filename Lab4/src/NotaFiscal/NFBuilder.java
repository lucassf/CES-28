package NotaFiscal;

import lab4.ProdutoServico;

public class NFBuilder {
    private NF nf;
    
    public void build(structIV[] sIV,String cpf,String nome) throws IllegalArgumentException{
        if (sIV.length==0)throw new IllegalArgumentException("Lista de itens vazia");
        
        IV[] iv = new IV[sIV.length];
        for (int i=0;i<sIV.length;i++){
            iv[i]=new IV(sIV[i].ps,sIV[i].quantidade,sIV[i].desconto);
        }
        
        nf = new NF(iv, nome, cpf);
    }
    
    public NF getNF(){
        return nf;
    }
}
