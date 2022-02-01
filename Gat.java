package br.com.dio.model;

public class Gato {
    
    private String nome;
    private String cor;
    private String idade;
    
    public Gato(String nome, String cor, Integer idade){
        this.nome= nome;
        this.cor= cor;
        this.idade= idade;
    }
    public String getNome() {
        return nome;
    }
    public void SetNome(String cor) { 
        this.cor = cor; 
    }

    public String getCor() {
        return cor;
    }
    public void SetCor(String cor) { 
        this.cor = cor; 
    }

    public String getIdade() {
        return idade;
    }
    public void SetIdade(String idade) { 
        this.idade = idade; 
    }

    @Override
    public int hashCode(){
        return Objects.hash(cor, idade, nome);
    }
     @Override
     public boolean equals(Object obj){
         if (this == obj)
             return true;
         if (obj == null)
             return false;
         if (getClass() != obj.getClass())
             return false;
         Gato other = (Gato) obj;
         return Object.equals(cor, other.cor) && Object.equals(idade, other.idade) && Objects.equals(nome, other.nome);          
     }

     @Override
     public String toString(){
         return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";

     }

}