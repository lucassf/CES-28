package lab4;

public class Servico extends ProdutoServico{
    private double precoHora;
    private String natureza;
    
    Servico(String nome,String categoriaTributaria,double precoUnidade,
            String materiaPrima,ProdutoServico[] associados){
        super(nome, categoriaTributaria, associados);
        this.precoHora = precoUnidade;
        this.natureza = materiaPrima;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }
}
