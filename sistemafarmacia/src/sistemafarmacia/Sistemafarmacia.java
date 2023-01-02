
package sistemafarmacia;

import cadastrodados.cliente;
import cadastrodados.farmaceuticos;
import cadastrodados.vendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafaelly
 */
public class Sistemafarmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            farmacia cadastrof = null;
            boolean teste = false;
            cliente[] cliente = null;
            int tamanhoc = 0;

            int menu = 0;
            while (menu != 10) {
                String op = JOptionPane.showInputDialog(null, "ESCOLHA UMA OPÇÃO:\n 1. CADASTRAR FARMÁCIA"
                        + "\n 2. CADASTRAR VENDEDOR\n 3. CADASTRAR FARMACÊUTICO \n 4. CADASTRAR MEDICAMENTO"
                        + "\n 5. CADASTRAR CLIENTE\n 6. VENDER MEDICAMENTO\n 7.EXIBIR INFORMAÇÕES DO FARMACÊUTICO\n "
                        + "8.EXIBIR INFORMAÇÕES DOS MEDICAMENTOS\n 9. EXIBIR INFORMAÇÕES DOS CLIENTES \n "
                        + "10.EXIBIR CONPROVANTE DE VENDA \n 11.EXIBIR CONTROLE\n "
                        + "12.SAIR ");
                int opcao = Integer.parseInt(op);
                switch (opcao) {
                    case 1:
                        if (teste == false) {
                            String nome = JOptionPane.showInputDialog(null, "O nome");
                            String CNPJ = JOptionPane.showInputDialog(null, "O CNPJ");
                            String endereco = JOptionPane.showInputDialog(null, "O endereço");
                            String telefone = JOptionPane.showInputDialog(null, "O telefone");
                            String site = JOptionPane.showInputDialog(null, "O site");
                            cadastrof = new farmacia(nome, CNPJ, endereco, telefone, site);
                            teste = true;

                        } else {
                            JOptionPane.showConfirmDialog(null, "EMPRESA JÁ CADASTRADA");
                            break;
                        }
                    case 2:
                        boolean teste2 = false;
                        if (teste2 != true) {

                            String tam = JOptionPane.showInputDialog(null,
                                    "Quantos cliente deseja cadastrar");
                            tamanhoc = Integer.parseInt(tam);
                            cliente = new cliente[tamanhoc];
                            teste2 = true;
                        } else {
                            for (int i = 0; i < tamanhoc; i++) {
                                if (cliente[i] == null) {
                                    String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
                                    String id = JOptionPane.showInputDialog(null, "Digite sua idade");
                                    int idade = Integer.parseInt(id);
                                    if(idade<18){
                                        JOptionPane.showConfirmDialog(null, "NÃO É POSSIVEL CADASTRAR");
                                        break;
                                    }
                                    String cpf = JOptionPane.showInputDialog(null, "Digite seu cpf");
                                    String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço ");
                                    String email = JOptionPane.showInputDialog(null, "Digite seu email ");
                                    String telefone = JOptionPane.showInputDialog(null, "Digite seu telefone");
                                    cliente[i] = new cliente(nome, idade, cpf, email, telefone, endereco);
                                } else {
                                    JOptionPane.showConfirmDialog(null, "NÃO É POSSIVEL CADASTRAR");
                            break;
                                }

                            }
                        }

                    case 3:
                        break;
                    case 4:

                        break;
                    case 5:
                        break;
                    case 6:

                        break;
                    case 7:
                        if (teste == true) {
                            cadastrof.exibirdados();

                        } else {

                            JOptionPane.showMessageDialog(null, "Empresa não cadastrada");
                            break;
                        }
                        break;
                    case 8:

                        break;
                    case 9:
                        break;
                    case 10:

                        break;
                    case 11:
                        break;
                    case 12:
                        menu = 10;

                        break;

                }

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro do tipo:" + erro);

        }

    }
}
