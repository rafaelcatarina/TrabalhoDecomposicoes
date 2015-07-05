import java.util.*;
public class Executa{
    public static void main(String [] args){
        Scanner x = new Scanner (System.in);
     
        System.out.println("Digite um valor a ser consultado: ");
        int n = x.nextInt();
        int[] lista = new int[1000002];
        
        //La�o criando uma lista apenas com valores 1 do indice 2 at� n
        for(int i=2; i<=n; i++)
            lista[i] = 1;
            
        //Declarando a como primeiro elemento e b como segundo elemento    
        int a = 1;
        int b = 2;
        
        //Comparando o primeiro elemento enquanto � <= a metade de n + 1
        while (a <= (n/2)+1){
        
            //F�rmula da soma dos termos de uma P.A. finita sem a divis�o por 2    
            int funcao = (a + b) * ((b + 1) - a);
            
            //Um if comparando se a soma da P.A. � menor ou igual ao valor a ser consultado
            if((funcao/2) <= n){
              lista [funcao/2] ++;
              b++;
            }
            else{
                a++;
                b = a+1;
            }
        }
        
        //Uma vari�vel auxiliar (aux) para armazenar o maior n�mero de decomposi��es
        int aux = 1;
        for(int i=2; i<=n; i++)
            if(lista[i] >= aux){
            aux = lista[i];
        }
        
        //Imprimindo na tela todos os n�meros que tem o maior n�mero de decomposi��es
        for(int i=2; i<=n; i++)
            if(lista[i] == aux){
            System.out.println("O numero " + i + " tem " + aux + " decomposicoes!!!");
            }
    }
    }//Fim
