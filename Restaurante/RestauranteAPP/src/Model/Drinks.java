package Model;

public class Drinks {
    private String jugo, agua, refresco;

    public Drinks() {
    }

    public Drinks(String jugo, String agua, String refresco) {
        this.jugo = jugo;
        this.agua = agua;
        this.refresco = refresco;
    }

    public String getJugo() {
        return jugo;
    }

    public void setJugo(String jugo) {
        this.jugo = jugo;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    @Override
    public String toString() {
        return "Bebidas [jugo=" + jugo + ", agua=" + agua + ", refresco=" + refresco + "]";
    }
}