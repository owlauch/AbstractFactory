package main.abstractfactory;

public class FabricaCarro {

    private Carro carro;
    private Variante variante;

    @SuppressWarnings("null")
    public static FabricaCarro constroiCarro(String tipo) {
        CarroFactory carroFactory = null;
        switch(tipo){
            case "Popular":
                carroFactory = new CarroPopularFactory();
                break;
            case "Luxo":
                carroFactory = new CarroLuxoFactory();
        }
        FabricaCarro fabricaCarro = new FabricaCarro();
        fabricaCarro.setCarro(carroFactory.escolherCarro());
        fabricaCarro.setVariante(carroFactory.escolherVariante());
        return fabricaCarro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Variante getVariante() {
        return variante;
    }

    public void setVariante(Variante variante) {
        this.variante = variante;
    }
}
