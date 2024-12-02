package Model;

public class Dessert {
    private String helado,tarta;

    public Dessert() {
    }

    public Dessert(String helado, String tarta) {
        this.helado = helado;
        this.tarta = tarta;
    }

    public String getHelado() {
        return helado;
    }

    public void setHelado(String helado) {
        this.helado = helado;
    }

    public String getTarta() {
        return tarta;
    }

    public void setTarta(String tarta) {
        this.tarta = tarta;
    }

    @Override
    public String toString() {
        return "Desessert [helado=" + helado + ", tarta=" + tarta + "]";
    }
    
}
