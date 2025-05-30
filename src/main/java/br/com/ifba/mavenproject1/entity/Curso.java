/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.mavenproject1.entity;

/**
 *
 * @author a1591
 */
public class Curso {
    
    private String nome;
    private String codigoCurso;
    
    private Servidor servidor;

    public Curso() {
    }

    public Curso(String nome, String codigoCurso, Servidor servidor) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.servidor = servidor;
    }

        @Override
        public String toString() {
            return "Curso{" +
                   "nome='" + this.nome + '\'' +
                   ", codigo='" + this.codigoCurso + '\'' +
                   ", professor=" + (this.servidor!= null ? this.servidor.getNome() : "null") +
                   '}';
        }


    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }
    
    
    
}
