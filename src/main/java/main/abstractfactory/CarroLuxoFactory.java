package main.abstractfactory;

public class CarroLuxoFactory implements CarroFactory{

    @Override
    public Carro escolherCarro() {
        return new Ferrari();
    }

    @Override
    public Variante escolherVariante() {
        return new Luxo();
    }
    
}
