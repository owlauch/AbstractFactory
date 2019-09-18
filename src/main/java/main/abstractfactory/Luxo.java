package main.abstractfactory;

import java.util.ArrayList;

public class Luxo extends Variante {

    public Luxo() {
        defineAtributos();
    }

    private void defineAtributos() {
        ArrayList<String> atributos = new ArrayList();
        atributos.add("Possui roda de liga leve");
        atributos.add("Possui som bluetooth");
        atributos.add("Possui ar-condicionado.");
        atributos.add("Possui Easy Park");
        super.setVariante("Luxo");
        super.setEquipamentos(atributos);
    }
}
