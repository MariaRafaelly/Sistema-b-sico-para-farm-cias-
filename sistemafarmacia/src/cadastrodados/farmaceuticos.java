/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodados;

/**
 *
 * @author Rafaelly
 */
public class farmaceuticos extends pessoa {
    private String crf;
    public static int codf;
      public farmaceuticos(String nome, int idade, String crf, String sexo) {
        codf++;
        this.setNome(nome);
        this.setIdade(idade);
        this.setCrf(crf);
        this.setSexo(sexo);
        
       
    }

    /**
     * @return the crf
     */
    public String getCrf() {
        return crf;
    }

    /**
     * @param crf the crf to set
     */
    private void setCrf(String crf) {
        this.crf = crf;
    }
    
    
}
