/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana7Alunos;

/**
 *
 * @author Gustavo
 */
public class Aluno {
    
    private String nomeAluno;
    private int codigoAluno;
    private float notaProva;
    private float notaTrabalho;

    public Aluno(String nomeAluno, int codigoAluno, float notaProva, float notaTrabalho) {
        this.nomeAluno = nomeAluno;
        this.codigoAluno = codigoAluno;
        setNotaProva(notaProva);
        setNotaTrabalho(notaTrabalho);
    }

    public Aluno(){
    }
    
    public float getCalcularMedia(){
        return (this.notaProva + this.notaTrabalho) * 0.5f;
    }
    
    public String getNomeAluno(){
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public float getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(float notaProva) {
        //this.notaProva = notaProva;
        if (notaProva < 0){
            this.notaProva = 0;
        } else{
            this.notaProva = notaProva;
        }
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        //this.notaTrabalho = notaTrabalho;
        if (notaTrabalho < 0){
            this.notaTrabalho = 0;
        } else{
            this.notaTrabalho = notaTrabalho;
        }
    }
    
    
    
    
}
