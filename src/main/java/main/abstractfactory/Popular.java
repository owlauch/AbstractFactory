package main.abstractfactory;

import java.util.ArrayList;

public class Popular extends Variante {

    public Popular() {
        defineAtributos();
    }

    private void defineAtributos() {
        ArrayList<String> atributos = new ArrayList();
        atributos.add("Possui roda de ferro");
        atributos.add("Possui som CD Player");
        atributos.add("Possui sistema de aquecimento de ar");
        atributos.add("Possui sensor de estacionamento");
        super.setVariante("Popular");
        super.setEquipamentos(atributos);
    }
}
