package main.abstractfactory;

import java.util.ArrayList;

public abstract class Variante {
    private String variante;
    private ArrayList <String> equipamentos;

    public ArrayList<String> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<String> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }
    
}
