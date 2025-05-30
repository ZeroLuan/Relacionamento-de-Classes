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
public class Turma {
    
    private String nome;
    private Integer anoLetivo;
    
    private List<Aluno> alunos;
    
    private List<Disciplina> disciplinas;
    
    private List<Curso> cursos;

    public Turma() {
    }

    public Turma(String nome, Integer anoLetivo, List<Aluno> alunos, List<Disciplina> disciplina, List<Curso> curso) {
        this.nome = nome;
        this.anoLetivo = anoLetivo;
        this.alunos = new ArrayList<>();
        this.disciplinas = disciplina;
        this.cursos = curso;
    }

    @Override
    public String toString() {
        return "Turma{" +
               "nome='" + this.nome + '\'' +
               ", anoLetivo=" + this.anoLetivo +
               ", alunos=" + (alunos != null ? alunos.size() : 0) +
               ", disciplinas=" + (disciplinas != null ? disciplinas.size() : 0) +
               ", cursos=" + (cursos != null ? cursos.size() : 0) +
               '}';
    }

    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(Integer anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    public List<Curso> getCurso() {
        return cursos;
    }

    public void setCurso(List<Curso> curso) {
        this.cursos = curso;
    }

    
    
}
