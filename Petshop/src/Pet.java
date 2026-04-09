public class Pet {
    private String nome;
    private int idade;
    private double peso;
    private Banho banho;
    private Banho porte;
    private Tosa tosa;

    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;

    }

    public Tosa getTosa() {
        return tosa;
    }

    public void setTosa(Tosa tosa) {
        this.tosa = tosa;
    }

    public Banho getPorte(){
        return porte;
    }

        public Banho getBanho(){
        return banho;
    }
    public void setBanho(Banho banho){
        this.banho = banho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
