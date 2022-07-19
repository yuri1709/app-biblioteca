/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teca.model;
/**
 *
 * @author Yuri Conder
 */
public class Livro {
   static String autor,
           titulo,
           genero;
    static int codISBN;    
    static int nEdicao;
    static int disponibilidade;
    static int registro;
    static String emprestado;

   
   

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        Livro.registro = registro;
    }
    public String getGenero() {
        return genero;
    }

  public void setGenero(String genero) {
        this.genero = genero;
    }
  

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodISBN() {
        return codISBN;
    }

    public void setCodISBN(int codISBN) {
        this.codISBN = codISBN;
    }
   
    public int getnEdicao() {
        return nEdicao;
    }

    public void setnEdicao(int nEdicao) {
        this.nEdicao = nEdicao;
    }
    
     public String getEmprestado() {
        return emprestado;
    }
     
     public void setEmprestado(String emprestado) {
        Livro.emprestado = emprestado;
    } 

}
