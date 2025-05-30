/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.mavenproject1.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1591
 */
public class Disciplina {
    
    private String nome;
    private String codigo;
    
    private List<Professor> professores;

    public Disciplina(){
    }
    
    public Disciplina(String nome, String codigo, List<Professor> professores) {
        this.nome = nome;
        this.codigo = codigo;
        
        this.professores = new ArrayList<>(professores);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
               "nome='" + this.nome + '\'' +
               ", codigo='" + this.codigo + '\'' +
               ", professores=" + (professores != null ? professores.size() : 0) +
               '}';
    }

    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }


    
    
}
