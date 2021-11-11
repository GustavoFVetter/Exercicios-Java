
package VotacaoParaSindico;
import java.util.Scanner;

public class Main {

    // Autor Gustavo F. Vetter 05/11/2021
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        String candUm;
        String candDois;
        String candTres;
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int votoNulo = 0;
        int nrVotantes = 0; 
        int votosRegistrados = 0;
        int senha;
        int contraSenha = 0;
        int votoDigitado;
        
        System.out.println("Inicio do processo de votacao para Sindico");
        System.out.println(" ");
        System.out.println("Informe o nr de votantes deste evento:");
        nrVotantes = leia.nextInt();
        System.out.println(" ");
        System.out.println("Neste evento teremos " + nrVotantes + " votantes.");
        System.out.println(" ");
        
        System.out.println("Informe o nome do(a) candidato(a) nr 1:");
        candUm = leia.nextLine(); //Está passando direto nesta linha. Não espera atribuir o valor.
        System.out.println("O candidato nr 1 eh: " + candUm); //Não está lendo esta linha
        System.out.println(" "); //Não está lendo esta linha
        
        System.out.println("Informe o nome do(a) candidato(a) nr 2:");
        candDois = leia.nextLine();
        System.out.println("O candidato nr 2 eh: " + candDois);
        System.out.println(" ");
        
        System.out.println("Informe o nome do(a) candidato(a) nr 3:");
        candTres = leia.nextLine();
        System.out.println("O candidato nr 3 eh: " + candTres);
        System.out.println(" ");
        
        System.out.println("Informe uma senha numerica de 3 digitos:");
        senha = leia.nextInt();
        System.out.println("A senha digitada eh: " + senha);
        System.out.println("Memorize esta senha.");
        System.out.println(" ");
        
        while (votosRegistrados < nrVotantes){
            System.out.println(" ");
            System.out.println("Escolha um dos candidatos abaixo:");
            System.out.println("Digite 1 para votar em: " + candUm);
            System.out.println("Digite 2 para votar em: " + candDois);
            System.out.println("Digite 3 para votar em: " + candTres);
            System.out.println(" ");
            votoDigitado = leia.nextInt();
            
            
            
            switch (votoDigitado){
                case 1:
                    cand1 = cand1 + 1;
                    votosRegistrados = votosRegistrados + 1;
                    System.out.println(" ");
                    System.out.println("Voce votou em: " + candUm);
                    break;
                
                case 2:
                    cand2 = cand2 + 1;
                    votosRegistrados = votosRegistrados + 1;
                    System.out.println(" ");
                    System.out.println("Voce votou em: " + candDois);
                    break;
                
                case 3:
                    cand3 = cand3 + 1;
                    votosRegistrados = votosRegistrados + 1;
                    System.out.println(" ");
                    System.out.println("Voce votou em: " + candTres);
                    break;
                
                default:
                    votoNulo = votoNulo + 1;
                    votosRegistrados = votosRegistrados + 1;
                    System.out.println(" ");
                    System.out.println("Voto nulo ou invalido");
            }
        }
        
        if (votosRegistrados == nrVotantes){
            System.out.println(" ");    
            System.out.println("Votacao encerrada.");
            }
        
        while (senha != contraSenha){
        System.out.println(" ");
        System.out.println("Informe a senha para apurar os votos:");
        contraSenha = leia.nextInt();
            if(contraSenha == senha)
            {
            System.out.println(" ");
            System.out.println("Total de votos registrados neste evento: "
                    + votosRegistrados + " voto(s)");
            System.out.println(candUm + " teve " + cand1 + " voto(s).");
            // Aqui quero imprimir o percentual dos votos obtidos.
            // Diferenciar entre votos não nulos e total de votantes.
            System.out.println(candDois + " teve " + cand2 + " voto(s).");
            // Aqui quero imprimir o percentual dos votos obtidos.
            // Diferenciar entre votos não nulos e total de votantes.
            System.out.println(candTres + " teve " + cand3 + " voto(s).");
            // Aqui quero imprimir o percentual dos votos obtidos.
            // Diferenciar entre votos não nulos e total de votantes.
            System.out.println("Total de votos nulos ou invalidos: " 
                    + votoNulo + " voto(s).");
            // Aqui quero imprimir o percentual dos votos obtidos.
            } 
            else
            {
                System.out.println("Senha incorreta. Digite novamente.");
            }
        }
    }
    
}
