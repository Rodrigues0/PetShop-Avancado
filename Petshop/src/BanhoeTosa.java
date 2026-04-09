public class BanhoeTosa {
    private String pelagemCombo;
    private String porteCombo;
    private double valorCombo;

    public BanhoeTosa(String pelagemCombo, String porteCombo, double valorCombo) {
        this.pelagemCombo = pelagemCombo;
        this.porteCombo = porteCombo;
        this.valorCombo = valorCombo;
    }

    public String getPelagemCombo() {
        return pelagemCombo;
    }

    public void setPelagemCombo(String pelagemCombo) {
        this.pelagemCombo = pelagemCombo;
    }

    public String getPorteCombo() {
        return porteCombo;
    }

    public void setPorteCombo(String porteCombo) {
        this.porteCombo = porteCombo;
    }

    public double getValorCombo() {
        return valorCombo;
    }

    public void setValorCombo(double valorCombo) {
        this.valorCombo = valorCombo;
    }
}
