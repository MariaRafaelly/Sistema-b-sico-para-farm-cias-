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
public class cliente extends pessoa{

   

    public cliente(String nome, int idade, String cpf, String telefone, String email, String endereço) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setEndereço(endereço);
        
    }

    

}
