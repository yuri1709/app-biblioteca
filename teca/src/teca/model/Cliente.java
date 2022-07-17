package teca.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Gamer
 */
public class Cliente {
    static String  nome, 
            endereco, 
            cpf;
           
    static Integer matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }        
       
    public void exibirCliente() {
         JOptionPane.showMessageDialog(null,"Dados encontrados com sucesso!\n"+
                                                                       "------------------------------\n"+
                                                                       "Nome  : "+nome+"\n"+
                                                                       "Endereço  "+endereco+"\n"+
                                                                       "CPF  "+cpf+"\n"+
                                                                       "Matrícula  "+matricula+"\n"+
                                                                       "------------------------------");          
    }  
    
    public void limparCache() {
        nome = "";
        endereco = "";
        cpf = "";
        matricula = null;
    }
    
}
