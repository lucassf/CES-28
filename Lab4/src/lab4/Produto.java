package lab4;

public class Produto extends ProdutoServico{
    private double precoUnidade;
    private String materiaPrima;
    
    Produto(String nome,String categoriaTributaria,double precoUnidade,
            String materiaPrima,ProdutoServico[] associados){
        super(nome, categoriaTributaria, associados);
        this.precoUnidade = precoUnidade;
        this.materiaPrima = materiaPrima;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
}
