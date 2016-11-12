package NotaFiscal;

import lab4.ProdutoServico;

public class IV {
    private int quantidade;
    private double desconto;
    private String dataDiferenciada;
    private ProdutoServico ps;
    
    IV(ProdutoServico ps,int quantidade,double desconto){
        this.ps = ps;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.dataDiferenciada = "N/A";
    }
}
