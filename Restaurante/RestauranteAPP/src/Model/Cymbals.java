package Model;

public class Cymbals {
    private String carne, pollo,pescado;

    public Cymbals() {
    }

    public Cymbals(String carne, String pescado, String pollo) {
        this.carne = carne;
        this.pescado = pescado;
        this.pollo = pollo;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getPollo() {
        return pollo;
    }

    public void setPollo(String pollo) {
        this.pollo = pollo;
    }

    public String getPescado() {
        return pescado;
    }

    public void setPescado(String pescado) {
        this.pescado = pescado;
    }

    @Override
    public String toString() {
        return "Cymbals [carne=" + carne + ", pollo=" + pollo + ", pescado=" + pescado + "]";
    }

}