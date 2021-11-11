
package Semana7Alunos;

import java.util.Scanner;

/**
  * @author Gustavo F. Vetter 09/11/2021
 */
public class Main {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        Aluno AlunoUm = new Aluno("Higor Oliveira", 125, -9, 7.5f);
        AlunoUm.setNotaProva(8);
        System.out.println("Aluno " + AlunoUm.getNomeAluno() + " codigo " 
                + AlunoUm.getCodigoAluno() + " tem media geral de " 
                + AlunoUm.getCalcularMedia());
        
        System.out.println("");
        
        Aluno AlunoDois = new Aluno();
        AlunoDois.setCodigoAluno(1703);
        AlunoDois.setNomeAluno("Gustavo Vetter");
        AlunoDois.setNotaProva(7);
        AlunoDois.setNotaTrabalho(8.5f);
        System.out.println("Aluno " + AlunoDois.getNomeAluno() + " codigo " 
                + AlunoDois.getCodigoAluno() + " tem media geral de " 
                + AlunoDois.getCalcularMedia());
    
        System.out.println("");
        
        Aluno Aluno3 = new Aluno();
        System.out.println("Digite o nome do Aluno:");
        Aluno3.setNomeAluno(leia.nextLine());
        System.out.println("Digite o codigo do Aluno:");
        Aluno3.setCodigoAluno(leia.nextInt());
        System.out.println("Digite a nota da prova do Aluno:");
        Aluno3.setNotaProva(leia.nextFloat());
        System.out.println("Digite a nota do trabalho do Aluno:");
        Aluno3.setNotaTrabalho(leia.nextFloat());
        
        
        System.out.println("Aluno " + Aluno3.getNomeAluno() + " codigo " 
                + Aluno3.getCodigoAluno() + " tem media geral de " 
                + Aluno3.getCalcularMedia());
        
        
        
    }
    
}
