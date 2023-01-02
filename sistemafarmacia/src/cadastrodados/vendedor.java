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
public class vendedor extends pessoa{
    
    
    private String sexo;
    public static int cod;

    public vendedor(String nome, int idade, String cpf, String sexo) {
        cod++;
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.sexo=sexo;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
    
}
