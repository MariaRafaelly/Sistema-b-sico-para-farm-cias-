/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafarmacia;
import cadastrodados.farmaceuticos;

/**
 *
 * @author Rafaelly
 */
public class medicamentocontrolado extends medicamento{
    private farmaceuticos responsavel;
   
 public medicamentocontrolado(String nome, String descricao, String validade, int lote, 
         double valor, farmaceuticos responsavel) {
        codm++;
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setValidade(validade);
        this.setValidade(validade);
        this.setValor(valor);
        this.setResponsavel(responsavel);  
    }    

    /**
     * @return the responsavel
     */
    public farmaceuticos getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(farmaceuticos responsavel) {
        this.responsavel = responsavel;
    }
    
    
}
