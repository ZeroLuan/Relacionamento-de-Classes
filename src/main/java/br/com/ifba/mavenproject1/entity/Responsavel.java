/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.mavenproject1.entity;

/**
 *
 * @author a1591
 */
public class Responsavel extends Pessoa{
    
    private Aluno aluno;

    public Responsavel() {
    }

    public Responsavel(String nome, String telefone, String email, String cpf, Aluno aluno) {
        super(nome, telefone, email, cpf);
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Responsavel{" +
               "nome='" + this.nome + '\'' +
               ", telefone='" + this.telefone + '\'' +
               ", email='" + this.email + '\'' +
               ", cpf='" + this.cpf + '\'' +
               ", aluno=" + (this.aluno != null ? this.aluno.getNome() : "null") +
               '}';
    }


    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
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
