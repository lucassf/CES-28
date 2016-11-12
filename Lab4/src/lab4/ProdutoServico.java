package lab4;

public abstract class ProdutoServico {
    private ProdutoServico[] associados;
    private String nome;
    private String categoriaTributaria;
    
    ProdutoServico(String nome,String categoriaTributaria,ProdutoServico[] associados){
        this.nome=nome;
        this.categoriaTributaria=categoriaTributaria;
        this.associados = associados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoriaTributaria() {
        return categoriaTributaria;
    }

    public void setCategoriaTributaria(String categoriaTributaria) {
        this.categoriaTributaria = categoriaTributaria;
    }
}
