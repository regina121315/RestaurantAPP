package Model;

public class Menu {
    
private String adress;
public Menu(){}
public Menu(String adress){
    this.adress=adress;
}
public String getAdress() {
    return adress;
}
public void setAdress(String adress) {
    this.adress = adress;
}
@Override
public String toString() {
    return "La ubicacion seleccionada es:" + adress + "";
}

}
