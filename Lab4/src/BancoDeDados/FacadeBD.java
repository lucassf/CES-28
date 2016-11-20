package BancoDeDados;

import PS.ProdutoServico;
import NotaFiscal.NF;
import structs.*;

public enum FacadeBD {
    INSTANCE;
    
    private BD_NF bd_nf;
    private BD_PS bd_ps;
    private BD_Tax bd_tax;
    
    FacadeBD(){
        bd_nf = BD_NF.INSTANCE;
        bd_ps = BD_PS.INSTANCE;
        bd_tax = BD_Tax.INSTANCE;
    }
    
    public ProdutoServico buscarPS(int index){
        return bd_ps.pegarPS(index);
    }
    
    public void cadastrarProdutoAlimenticio(structProduto spd){
        bd_ps.cadastrarProdutoAlimenticio(spd);
    }
    
    public void cadastrarServicoConstrucao(structServico sServico){
        bd_ps.cadastrarServicoConstrucao(sServico);
    }
    
    public void cadastrarServicoTransporte(structServico sServico){
        bd_ps.cadastrarServicoTransporte(sServico);
    }
    
    public void validarNF(NF nf){
        bd_nf.validarNF(nf);
    }
}
