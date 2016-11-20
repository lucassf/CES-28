package PS;

import impostos.ImpostosVisitor;


public abstract class ProdutoServico {
    protected ProdutoServico[] associados;
    private String nome;
    protected String categoriaTributaria;
    
    ProdutoServico(String nome,ProdutoServico[] associados,String categoriaTributaria){
        this.nome=nome;
        this.associados = associados;
        this.categoriaTributaria =categoriaTributaria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoriaTributaria() {
        return categoriaTributaria;
    }
    
    public void setCategoriaTributaria(String materiaPrima) {
        this.categoriaTributaria = categoriaTributaria;
    }
    public abstract void accept(ImpostosVisitor imposto);
    
    public double calcular(){
        double valor = getValor();
        for(ProdutoServico ps:associados){
            valor += ps.calcular();
        }
        return valor;
    }
    
    abstract double getValor();
}
