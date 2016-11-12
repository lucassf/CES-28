package NotaFiscal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class NF {
    private static int globalid = 1;
    
    private int id;
    
    private int valor;
    private Date DataDeEntrega;
    private String nomeCliente;
    private String cpfCliente;
    private ArrayList<IV> itensVenda;
    
    public NF(IV[] iv,String nomeCliente,String cpfCliente){
        itensVenda = new ArrayList(Arrays.asList(iv));
        DataDeEntrega = new Date();
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        
        id = -1;
    }
}
