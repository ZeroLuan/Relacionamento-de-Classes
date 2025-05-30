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
public class Servidor extends Pessoa{
    
    private String siape;
    
    private List<Curso> cursos;

    public Servidor() {
    }

    public Servidor(String nome, String telefone, String email, String cpf, String siape, List<Curso> cursos) {
        super(nome, telefone, email, cpf);
        this.siape = siape;
        this.cursos = new ArrayList<>(cursos);
    }

    @Override
    public String toString() {
        return "Servidor{" + "siape=" + siape + ", cursos=" + cursos + '}';
    }
    
    

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
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
