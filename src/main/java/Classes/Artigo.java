 package Classes;
import Modelo.Obra;
/**
 * Classe Artigo, implementado por obra
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */
public class Artigo implements Obra{
        /**Uma String que armazena o nome do Artigo*/
        private String nome;
        /**Uma String que armazena o assunto do Artigo*/
        private String assunto;
        /**Um inteiro que armazena o codigo do Artigo*/
        private final int codigo;
        /**Uma String que armazena o autor do Artigo*/
        private String autor;
        /**Um inteiro que armazena a quantidade de cópias do Artigo*/
        private int copias;
/**
 * Construtor da classe
     * @param nome o Nome do Artigo
     * @param assunto o assunto do Artigo
     * @param autoria o autor do Artigo
     * @param copias a quantidade de copias do Artigo
     * @param cod o codigo do Artigo
 */
public Artigo(String nome, String assunto, String autoria,int copias,int cod) {
this.nome = nome;
this.assunto = assunto;
this.codigo = cod;
this.autor = autoria;
this.copias=copias;
}
/**
* Metodo para retorno do Autor do Artigo
     * @return o autor
*/

public String getAutor() {
return autor;
}
    /**
    * Metodo para modificar o Autor do Artigo
    * @param autor o novo autor
    */
        
public void setAutor(String autor) {
this.autor = autor;
}
    /**
    * Metodo para retorno do nome do Artigo
    * @return o nome
    */

public String getNome() {
return this.nome;
}
/** 
* Metodo para modificar o nome do Artigo
* @param nome o novo nome
*/

public void setNome(String nome) {
this.nome = nome;
}
/**
* Metodo para retorno do assunto do Artigo
     * @return o assunto do Artigo
*/

public String getAssunto() {
return this.assunto;
}
/** 
* Metodo para modificar o assunto do Artigo
* @param assunto novo assunto
*/

public void setAssunto(String assunto) {
this.assunto = assunto;
}
/**
* Metodo para retorno do codigo do Artigo
     * @return o codigo do Artigo
*/

public int getCod() {
return codigo;
}
/**
* Metodo para retorno do tipo 
     * @return o tipo de Obra
*/
    
    public String getTipo() {
        return "Artigo";
    }
/**
 * Metodo para modificar a Editora de Artigo
 * @param editora nova editora
 */
    
    public void setEditora(String editora) {
    }
    /**
* Metodo para retorno da Editora do Artigo
     * @return a Editora do Artigo 
*/
    
    public String getEditora() {
      return null;
    }
    /**
     * Metodo para modificar o Genero de Artigo
     * @param genero novo genero
     */
    
    public void setGenero(String genero) {
    }
    /**
    * Metodo para retorno do Genero do Artigo
        * @return o gênero do Artigo
    */
    
    public String getGenero() {
            return null;
    }
    /**
     * Metodo para modificar o numero dos Artigos
     * @param numero novo numero
     */
    
    public void setNumero(String numero) {
    }
    /**
    * Metodo para retorno do numero dos Artigos
        * @return o numero dos Artigos
    */
    
    public String getNumero() {
        return null;
    }
    /**
    * Metodo para retorno das copias dos Artigos
        * @return a quantidade de copias do Artigo
    */
    
    public int getCopias() {
        return copias;
    }
    /**
     * Metodo para modificar o numero das copias dos Artigos
     * @param n nova quantidade de copias
     */
    
    public void setCopias(int n) {
        this.copias=n;
    }

 

}
