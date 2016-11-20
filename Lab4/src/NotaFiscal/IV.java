package NotaFiscal;

import PS.ProdutoServico;

public class IV {
    private int quantidade;
    private double desconto;
    private String dataDiferenciada;
    private ProdutoServico ps;
    private double valor;
    
    IV(ProdutoServico ps,int quantidade,double desconto){
        this.ps = ps;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.dataDiferenciada = "N/A";
        
        valor = computarTotal();
    }
    
    private double computarTotal(){
        return this.quantidade*ps.calcular()*(1-desconto/100);
    }
    
    public double getTotal(){
        return valor;
    }
}
