/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.mavenproject1.entity;

import java.util.List;

/**
 *
 * @author a1591
 */
public class TecnicoAdmnistrativo extends Servidor{

    public TecnicoAdmnistrativo() {
    }

    public TecnicoAdmnistrativo(String nome, String telefone, String email, String cpf, String siape, List<Curso> cursos) {
        super(nome, telefone, email, cpf, siape, cursos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TecnicoAdmnistrativo{");
        sb.append('}');
        return sb.toString();
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
