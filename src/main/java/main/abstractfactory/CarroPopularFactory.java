package main.abstractfactory;

public class CarroPopularFactory implements CarroFactory{

    @Override
    public Carro escolherCarro() {
        return new Ford();
    }

    @Override
    public Variante escolherVariante() {
        return new Popular();
    }
    
}
