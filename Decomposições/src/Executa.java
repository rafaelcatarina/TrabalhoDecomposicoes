import java.util.*;
public class Executa{
    public static void main(String [] args){
        Scanner x = new Scanner (System.in);
     
        System.out.println("Digite um valor a ser consultado: ");
        int n = x.nextInt();
        int[] lista = new int[1000002];
        
        //Laço criando uma lista apenas com valores 1 do indice 2 até n
        for(int i=2; i<=n; i++)
            lista[i] = 1;
            
        //Declarando a como primeiro elemento e b como segundo elemento    
        int a = 1;
        int b = 2;
        
        //Comparando o primeiro elemento enquanto é <= a metade de n + 1
        while (a <= (n/2)+1){
        
            //Fórmula da soma dos termos de uma P.A. finita sem a divisão por 2    
            int funcao = (a + b) * ((b + 1) - a);
            
            //Um if comparando se a soma da P.A. é menor ou igual ao valor a ser consultado
            if((funcao/2) <= n){
              lista [funcao/2] ++;
              b++;
            }
            else{
                a++;
                b = a+1;
            }
        }
        
        //Uma variável auxiliar (aux) para armazenar o maior número de decomposições
        int aux = 1;
        for(int i=2; i<=n; i++)
            if(lista[i] >= aux){
            aux = lista[i];
        }
        
        //Imprimindo na tela todos os números que tem o maior número de decomposições
        for(int i=2; i<=n; i++)
            if(lista[i] == aux){
            System.out.println("O numero " + i + " tem " + aux + " decomposicoes!!!");
            }
    }
    }//Fim
