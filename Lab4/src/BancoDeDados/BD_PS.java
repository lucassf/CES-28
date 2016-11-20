package BancoDeDados;

import PS.*;
import java.util.List;
import structs.structProduto;
import structs.structServico;

enum BD_PS {

    INSTANCE;

    private List<ProdutoServico> pslist;

    private class ProdutosAlimenticios extends Produto {

        private ProdutosAlimenticios(structProduto sproduto) {
            super(sproduto);
        }
    }

    private class ServicosConstrucao extends Servico {

        private ServicosConstrucao(structServico sServico) {
            super(sServico);
        }

    }
    
    private class ServicosTransporte extends Servico {

        private ServicosTransporte(structServico sServico) {
            super(sServico);
        }

    }
    
    

    ProdutoServico pegarPS(int codbarra) {
        return pslist.get(codbarra);
    }

    void cadastrarProdutoAlimenticio(structProduto spd) {
        pslist.add(new ProdutosAlimenticios(spd));
    }

    void cadastrarServicoConstrucao(structServico sServico) {
        pslist.add(new ServicosConstrucao(sServico));
    }

    void cadastrarServicoTransporte(structServico sServico) {
        pslist.add(new ServicosTransporte(sServico));
    }
}
