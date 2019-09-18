package main.abstractfactory;

public class main {

    public static void main(String[] args) {
        FabricaCarro fc = FabricaCarro.constroiCarro("Luxo");
        System.out.println("Marca:"+fc.getCarro().getMarca());
        System.out.println("modelo:"+fc.getCarro().getModelo());
        System.out.println("ano:"+fc.getCarro().getAno());
        System.out.println("Acessorios:"+fc.getVariante().getEquipamentos());
        System.out.println("---------------------------------");
        FabricaCarro fc2 = FabricaCarro.constroiCarro("Popular");
        System.out.println("Marca:"+fc2.getCarro().getMarca());
        System.out.println("modelo:"+fc2.getCarro().getModelo());
        System.out.println("ano:"+fc2.getCarro().getAno());
        System.out.println("Acessorios:"+fc2.getVariante().getEquipamentos());
    }

}
