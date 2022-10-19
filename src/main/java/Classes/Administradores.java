package Classes;

import Modelo.Administrador;

/**
 * Classe Administradores, implementado por Administrador
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */

public class Administradores implements Administrador{
    
    /**Uma String onde vai ser armazenado o nome do Administrador */
    private String nome;
    /**Uma String onde vai ser armazenado o cpf do Administrador */
    private String cpf;
    /**Uma String onde vai ser armazenado o rg do Administrador */
    private String rg;
    /**Uma String onde vai ser armazenado o telefone do Administrador */
    private String telefone;
    /**Uma String onde vai ser armazenado o endereço do Administrador */
    private String endereco;
    /**Uma String onde vai ser armazenado o senha do Administrador */
    private String senha;
    /**Uma String onde vai ser armazenado o user do Administrador */
    private String user;
    /**Uma String onde vai ser armazenado o tipo de Administrador */
    private String tipo;        
            
            
            
     /**
      * Construtor da Classe
      * @param nome nome do Administrador
      * @param cpf cpf do Administrador
      * @param rg rg do Administrador 
      * @param telefone telefone do Administrador
      * @param endereco endereço do Administrador
      * @param senha senha do Administrador
      * @param user user do Administrador
      * @param tipo tipo do Administrador
      */
        public Administradores(String nome,String cpf,String rg,String telefone,String endereco,String senha,String user,String tipo){
            this.nome=nome;
            this.cpf=cpf;
            this.rg=rg;
            this.telefone=telefone;
            this.endereco=endereco;
            this.senha=senha;
            this.user=user;
            this.tipo=tipo;
            
        }
    /**
    * Metodo para retorno do nome do Administrador
    * @return o nome do Administrador
    */
    
    public String getNome() {
        return this.nome;
    }
    /**
    * Metodo para modificar o nome do Administrador
    * @param nome novo nome
    */
    
    public void setNome(String nome) {
        this.nome=nome;
    }
    /**
     * Metodo para retorno do cpf do Administrador
     * @return o cpf do administrador
     */
    
    public String getCPF() {
        return this.cpf;
    }
    /** 
    * Metodo para modificar o cpf do Administrador
    * @param cpf novo cpf
    */
    
    public void setCPF(String cpf) {
        this.cpf=cpf;
    }
    /**
     * Metodo para retorno do RG do Administrador
     * @return o rg do Adminitrador
     */
    
    public String getRG() {
        return this.rg;
    }
    /**
    * Metodo para modificar o RG do Administrador
    * @param rg o novo rg
    */
    
    public void setRG(String rg) {
        this.rg=rg;
    }
    
    /**
    * Metodo para retorno do tipo do Administrador
    * @return o tipo do Administrador
    */
    
    public String getTipo() {
        return this.tipo;
    }
    /** 
    * Metodo para modificar o tipo do Administrador
    * @param tipo o o novo tipo
    */
    
    public void setTipo(String tipo) {
        this.tipo=tipo;
    }
    /**
    * Metodo para retorno do telefone do Administrador
    * @return o Telefone do Administrador
    */
    
    public String getTelefone() {
        return this.telefone;
    }
    /** 
    * Metodo para modificar o telefone do Administrador
    * @param telefone o novo telefone
    */
    
    public void setTelefone(String telefone) {
        this.telefone=telefone;
    }
    /**
    * Metodo para retorno do endereço do Administrador
    * @return o Endereço do Administrador
    */
    
    public String getEndereco() {
        return this.endereco;
    }
    /** 
    * Metodo para modificar o endereço do Administrador
    * @param Endereco o novo endereço
    */
    
    public void setEndereco(String Endereco) {
        this.endereco=Endereco;
    }
    /**
    * Metodo para retorno da senha do Administrador
    * @return a Senha do Administrador
    */
    
    public String getSenha() {
        return this.senha;
    }
        /** 
    * Metodo para modificar a senha do Administrador
    * @param senha a nova senha
    */
    
    public void setSenha(String senha) {
        this.senha=senha;
    }
/**
    * Metodo para retorno do user do Administrador
    * @return o User do Administrador
    */
    
    public String getUser() {
        return this.user;
    }
        /** 
    * Metodo para modificar o user do Administrador
    * @param user o novo user
    */
    
    public void setUser(String user) {
        this.user=user;
    }

}
