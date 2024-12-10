//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Auto(new Conductor("Jorge",false));
        Conductor maria = new Conductor("Maria",true);
        System.out.println("Precio a pagar peaje de un auto con conductor sin infraccion:"+auto.precioPeajeApagar());


        System.out.println("Tiene maria infraccion? "+ maria.isTieneInfraccion());



        Vehiculo camion = new Camion (new Conductor("Jorge",true),3);
        System.out.println("Precio a pagar peaje de un camion con conductor con infraccion:"+camion.precioPeajeApagar());


    }
}