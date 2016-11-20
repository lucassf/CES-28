package NotaFiscal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class NF {

    private final double valorTotal;
    private final Date DataDeEntrega;
    private final String nomeCliente;
    private final String cpfCliente;
    private final List<IV> itensVenda;
    private final int id;
    
    private static int globalid = 1;
    
    NF(IV iv,String nomeCliente,String cpfCliente){
        this.itensVenda = new ArrayList(Arrays.asList(iv));
        this.DataDeEntrega = new Date();
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.valorTotal = 0;
        this.id = -1;
    }
    
    NF(NF nf,double total){
        this.id = globalid++;
        this.nomeCliente = nf.nomeCliente;
        this.cpfCliente = nf.cpfCliente;
        this.valorTotal = total;
        this.itensVenda = Collections.unmodifiableList(nf.itensVenda);
        this.DataDeEntrega = new Date();
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public Date getDataDeEntrega() {
        return DataDeEntrega;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public List<IV> getItensVenda() {
        return itensVenda;
    }
    
    void addIV(IV iv){
        getItensVenda().add(iv);
    }
    
    boolean deleteIV(IV iv){
        return getItensVenda().remove(iv);
    }
    
    
}
