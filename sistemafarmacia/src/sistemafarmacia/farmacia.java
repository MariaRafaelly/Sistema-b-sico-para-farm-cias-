package sistemafarmacia;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafaelly
 */
public class farmacia {
  
    private String CNPJ;
    private String empresa;
    private String endereco;
    private String telefone;
    private String Site;

    public farmacia(String CNPJ, String empresa, String endereco, String telefone, String Site) {
        this.CNPJ = CNPJ;
        this.empresa = empresa;
        this.endereco = endereco;
        this.telefone = telefone;
        this.Site = Site;
    }
    public void exibirdados(){
        
      JOptionPane.showMessageDialog(null, "EMPRESA:"+getEmpresa()+"CNPJ:"+getCNPJ()+"ENDEREÇO:"+
                 getEndereco()+"TELEFONE"+getTelefone()+"SITE:"+getSite());
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the Site
     */
    public String getSite() {
        return Site;
    }

    /**
     * @param Site the Site to set
     */
    public void setSite(String Site) {
        this.Site = Site;
    }
    
    
}
