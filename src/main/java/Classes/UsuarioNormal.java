package Classes;




import Modelo.Usuarios;




/**

 * Classe Ususario Normal, implementado por usuarios

 * @author Kyllder, Pedro e Thiago

 * @version 1.0

 */




public class UsuarioNormal implements Usuarios{

 /**Uma String onde vai ser armazenado o nome do Usario*/
    private String nome;
    /**Uma String onde vai ser armazenado o cpf do Usúario */
     private String cpf;
    /**Uma String onde vai ser armazenado o rg do Usúario */
    private String rg;
    /**Uma String onde vai ser armazenado o telefone do Usúario */
    private String telefone;
    /**Uma String onde vai ser armazenado o endereço do Usúario */
    private String endereco= null;
    /**Uma String onde vai ser armazenado o tipo de Usúario */
    private final String tipo="Normal";
    /**Um inteiro onde vai ser armazenado a quantidade de Obras que o Usúario pode pegar */
    private final int qtdObras=2;
    /**Uma double onde vai ser armazenado a divida do Usúario */
    private double divida=0;

/**

      * Construtor da classe
     * @param nome nome do Usuario
      * @param cpf cpf do Usuario
      * @param rg rg do Usuario 
      * @param telefone telefone do Usuario
      * @param endereco endereço do Usuario
      */

    

    public UsuarioNormal(String nome,String cpf,String rg,String telefone,String endereco){

        this.nome=nome;

        this.cpf=cpf;

        this.rg=rg;

        this.telefone=telefone;

        this.endereco=endereco;

        

    }

     /**

     * Construtor da classe, com divida e quantidade de obras
       *@param nome nome do Usuario
      * @param cpf cpf do Usuario
      * @param rg rg do Usuario 
      * @param telefone telefone do Usuario
      * @param endereco endereço do Usuario
     * @param divida divida do Usuario
      */

    

    public UsuarioNormal(String nome,String cpf,String rg,String telefone,String endereco, double divida){

        this.nome=nome;

        this.cpf=cpf;

        this.rg=rg;

        this.telefone=telefone;

        this.endereco=endereco;

        this.divida=divida;

    }

 
    /**

     * Metodo para retorno do nome do Ususario Comercial

     * @return nome do Usuario

     */

    

    public String getNome() {

        return this.nome;

    }

    /**
    * Metodo para modificar o nome do Usuario Comercial
    * @param nome novo nome
    */

    

    public void setNome(String nome) {

        this.nome=nome;    

    }

    /**

     * Metodo para retorno do cpf do Ususario Comercial

     * @return cpf do Ususario

     */

    

    public String getCPF() {

        return this.cpf;

    }

    /** 

    * Metodo para modificar o cpf do Usuario Comercial
   * @param cpf novo cpf

    */

    

    public void setCPF(String cpf) {

        this.cpf=cpf;

    }

    /**

     * Metodo para retorno do rg do Ususario Comercial

     * @return rg do Ususario

     */

    

    public String getRG() {

        return this.rg;

    }

    /** 

    * Metodo para modificar o rg do Usuario Comercial
     * @param rg novo rg

    */

    

    public void setRG(String rg) {

        this.rg=rg;

    }

    /**

     * Metodo para retorno do tipo do Ususario 

     * @return tipo do Ususario 

     */

    

    public String getTipo() {

        return this.tipo;

    }

    /** 

    * Metodo para modificar o tipo do Usuario, podendo ir para Usuario funcionario ou Usuario normal

    * @return Usuarios o novo usuario formado

    * @param tipo o novo tipo

    */

    

    public Usuarios setTipo(String tipo) {

        if (tipo.equalsIgnoreCase("funcionario")) {

           Usuarios b=new UsuarioFunc(nome, cpf, rg, telefone, endereco);

           return b;

        }else if (tipo.equalsIgnoreCase("Comerciario")) {

            Usuarios b=new UsuarioCom(nome, cpf, rg, telefone, endereco);

           return b;

        }

        return null;

    }
/**

     * Metodo para retorno do telefone do Ususario Comercial

     * @return telefone do Ususario

     */

    

    public String getTelefone() {

        return this.telefone;

    }

    /** 

    * Metodo para modificar o telefone do Usuario Comercial
     * @param telefone o novo telefone

    */

    

    public void setTelefone(String telefone) {

        this.telefone=telefone;

    }

    /**

     * Metodo para retorno do endereco do Ususario Comercial

     * @return endereco do Ususario

     */

    

    public String getEndereco() {

        return this.endereco;

    }

    /** 

    * Metodo para modificar o endereco do Usuario Comercial
   * @param Endereco novo endereço

    */

    

    public void setEndereco(String Endereco) {

        this.endereco=Endereco;

    }

    /**

     * Metodo para retorno da quantidade de obras do Ususario Comercial

     * @return a quantidades de Obras que o Usuario pode pegar

     */

    

    public int getQtdObras() {

        return qtdObras;

    }

    /**

     * Metodo para retorno se o Ususario está devendo ou não

     * @return se o Usuario está devendo

     */

    

    public boolean isDevendo() {

        if (divida>0) {

            return true;

        }

        return false;

    }

    /**

     * Metodo para retorno das dividas do Ususario Comercial

     * @return a divida do Ususario

     */

    

    public double getDivida() {

        

        return this.divida;

    }

    /** 

    * Metodo para modificar as dividas do Usuario Comercial
    * @param divida a nova divida

    */

    

    public void setDivida(double divida) {

            this.divida=divida;    

    }

    /**

     * Metodo para retorno dos dias que pode ficar com uma obra

     * @return os dias que o Usuario pode ficar com uma obra

     */

    

    public int getDias() {

        return 7;

    }

    /**

     * Metodo para retorno do preço de multa por dia de atraso

     * @return o preço de multa

     */

    

    public double getPreço() {

        return 1;

    }

}


