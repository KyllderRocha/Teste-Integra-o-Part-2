package Classes;
import Modelo.Obra;
/**
 * Classe dos Especificos, implementado por obra
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */
public class Especificos implements Obra {
        /**Uma String que armazena a editora do Especifico*/
        private String editora;
       /**Uma String que armazena o nome do Especifico*/
        private String nome;
        /**Uma String que armazena o assunto do Especifico*/
        private String assunto;
        /**Um inteiro que armazena o codigo do Especifico*/
        private final int codigo;
        /**Uma String que armazena o autor do Especifico*/
        private String autor;
        /**Um inteiro que armazena a quantidade de cópias do Especifico*/
        private int copias;
        
        /**
         * Construtor da classe
     * @param nome o nome do Especifico
     * @param assunto o assunto do Especifico
     * @param autor o autor do Especifico
     * @param editora a editora do Especifico
     * @param copias quantidade do Especifico
     * @param cod o codigo do Especifico
         */

        public Especificos(String nome,String assunto,String autor,String editora,int copias,int cod){
            this.nome = nome;
            this.assunto = assunto;
            this.codigo = cod;
            this.autor = autor;
            this.editora = editora;
            this.copias=copias;
        }
        /**
         * Metodo para retorno do Autor
         * @return o nome do autor
         * 
         */
        
public String getAutor() {
return autor;
}
        /**
    * Metodo para modificar o Autor
    * @param autor novo nome do autor
    */
        
public void setAutor(String autor) {
this.autor = autor;
}
        /**
         * Metodo para retorno da Editora
         * @return a editora
         * 
         */

public String getEditora() {
return editora;
}
  /**
* Metodo para modificar a editora
* @param editora nova editora
*/

public void setEditora(String editora) {
this.editora = editora;
        }
/**
     * Metodo para retorno do nome do Especifico
     * @return o nome
     * 
     */

public String getNome() {
return this.nome;
}
  /**
* Metodo para modificar o nome do Especifico
* @param nome novo nome
*/


public void setNome(String nome) {
this.nome = nome;

}

 /**
 * Metodo para retorno do Assunto
 * @return o assunto 
 * 
 */

public String getAssunto() {
return assunto;
}
/** 
* Metodo para modificar o Assunto
* @param assunto novo assunto
*/

public void setAssunto(String assunto) {
this.assunto = assunto;

}
/**
* Metodo para retorno do Codigo
* @return o codigo
* 
*/

public int getCod() {
return codigo;
}
/**
* Metodo para retorno do tipo
* @return o tipo de Obra
* 
*/
    
    public String getTipo() {
       return "Especificos";
    }
    /**
* Metodo para modificar o Genero
* @param genero novo genero
*/
    
    public void setGenero(String genero) {
        
    }
    /**
* Metodo para retorno do Genero
* @return o genero
* 
*/
    
    public String getGenero() {
         return null;
    }
    /**
* Metodo para modificar o Numero
* @param numero novo numero
*/
    
    public void setNumero(String numero) {
        
    }
    /**
* Metodo para retorno do Numero
* @return o numero
* 
*/
    
    public String getNumero() {
        return null;
    }
    /**
    * Metodo para retorno das Copias
    * @return a quantidade de copias
    * 
    */
    
    public int getCopias() {
        return copias;
    }
    /**
    * Metodo para modificar o numero das copias
    * @param n nova quantidade de copias
    */
    
    public void setCopias(int n) {
        this.copias=n;
    }
}


