/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.mavenproject1.entity;

/**
 *
 * @author a1591
 */
public class Aluno extends Pessoa {
    
    private String matricula;
    
    private Responsavel responsavel;
    
    private Turma turma;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String telefone, String email, String cpf, String matricula, Turma turma, Responsavel responsavel) {
        super(nome, telefone, email, cpf);
        this.matricula = matricula;
        this.responsavel = responsavel;
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
               "nome='" + this.nome + '\'' +
               ", telefone='" + this.telefone + '\'' +
               ", email='" + this.email + '\'' +
               ", cpf='" + this.cpf + '\'' +
               ", matricula='" + this.matricula + '\'' +
               ", responsavel=" + (this.responsavel != null ? this.responsavel.getNome() : "null") +
               '}';
    }

    
    

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
