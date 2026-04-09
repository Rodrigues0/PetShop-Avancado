public class Tosa {
    String tosaPelagem;
    String tosaPorte;
    private Pet pet;

    public Tosa(String tosaPelagem, String tosaPorte) {
        this.tosaPelagem = tosaPelagem;
        this.tosaPorte = tosaPorte;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getTosaPelagem() {
        return tosaPelagem;
    }

    public void setTosaPelagem(String tosaPelagem) {
        this.tosaPelagem = tosaPelagem;
    }

    public String getTosaPorte() {
        return tosaPorte;
    }

    public void setTosaPorte(String tosaPorte) {
        this.tosaPorte = tosaPorte;
    }
}
