/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafarmacia;
import cadastrodados.cliente;
import cadastrodados.vendedor;

/**
 *
 * @author Rafaelly
 */
public class venda {
    public static int codv;
    private vendedor vendedor;
    private medicamento tipomedicamento;
    private cliente cliente;
    private String pagamento;
    double desconto;

   public void vender(double valor,int quant){
       double total=(valor*quant)-desconto;
   }

   
    /**
     * @return the vendedor
     */
    public vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the tipomedicamento
     */
    public medicamento getTipomedicamento() {
        return tipomedicamento;
    }

    /**
     * @param tipomedicamento the tipomedicamento to set
     */
    public void setTipomedicamento(medicamento tipomedicamento) {
        this.tipomedicamento = tipomedicamento;
    }

    /**
     * @return the cliente
     */
    public cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the pagamento
     */
    public String getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    
    
    
    
    
    
    
}
