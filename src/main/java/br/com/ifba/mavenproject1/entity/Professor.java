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
public class Professor extends Servidor{
    
    private List<Disciplina> diciplinas;

    public Professor() {
    }
    
    
    public Professor(String nome, String telefone, String email, String cpf, String siape,List<Curso> cursos, List<Disciplina> diciplinas) {
        
        super(nome, telefone, email, cpf, siape, cursos);
        this.diciplinas = new ArrayList<>(diciplinas);
        
    }

    public List<Disciplina> getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(List<Disciplina> diciplinas) {
        this.diciplinas = diciplinas;
    }

@Override
public String toString() {
    return "Professor{" +
           "nome='" + this.nome + '\'' +
           ", telefone='" + this.telefone + '\'' +
           ", email='" + this.email + '\'' +
           ", cpf='" + this.cpf + '\'' +
           ", disciplinas=" + (diciplinas != null ? diciplinas.size() : 0) +
           '}';
}

    
    

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
