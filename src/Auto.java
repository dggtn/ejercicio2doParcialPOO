public class Auto extends Vehiculo {

    private float precioFijo = 3500;
    private int descuento = 134;

    public Auto(Conductor conductor) {
        super(conductor);
    }

    @Override
    public float precioPeajeApagar() {
        if (conductor.tieneInfraccion) {
            this.precioApagar = precioFijo;
        } else {
            this.precioApagar = precioFijo - descuento;
        }
        return precioApagar;
    }
}



