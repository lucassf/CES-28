package NotaFiscal;

import lab4.ProdutoServico;

public class NFBuilder {
    private NF nf;
    
    public void build(ProdutoServico[] ps,int[] quantidade,double[] desconto,
            String cpf,String nome) throws IllegalArgumentException{
        if (ps.length==0)throw new IllegalArgumentException("Lista de itens vazia");
        if (ps.length!=quantidade.length||desconto.length!=quantidade.length)
            throw new IllegalArgumentException("Tamanho invalido da lista");
        
        IV[] iv = new IV[ps.length];
        for (int i=0;i<ps.length;i++){
            iv[i]=new IV(ps[i],quantidade[i], desconto[i]);
        }
        
        nf = new NF(iv, nome, cpf);
    }
    
    public NF getNF(){
        return nf;
    }
}
