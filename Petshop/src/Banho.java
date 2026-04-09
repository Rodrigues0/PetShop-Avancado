public class Banho {
    private String pelagem;
    private String porte;
    private Pet pet;
    private Pet nome;

    public Pet getNome() {
        return nome;
    }

    public void setNome(Pet nome) {
        this.nome = nome;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }



    public Banho(String pelagem, String porte) {
        this.pelagem = pelagem;
        this.porte = porte;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}

