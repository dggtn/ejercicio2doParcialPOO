public class Camion extends Vehiculo {
    int canToneladas;
    private float precioFijo = 9800;
    private int plusPOrTonelada = 1200;

    public Camion(Conductor conductor,int canToneladas) {
        super(conductor);
        this.canToneladas=canToneladas;
    }


    public int obtenerCanToneladas() {
        return canToneladas;
    }

    public void modificarCanToneladas(int canToneladas) {
        this.canToneladas = canToneladas;
    }

    @Override
    public float precioPeajeApagar() {
        if (conductor.tieneInfraccion) {
            this.precioApagar = ((precioFijo + canToneladas * plusPOrTonelada) * 2);
        } else {
            this.precioApagar = precioFijo + canToneladas * plusPOrTonelada;
        }
        return precioApagar;

    }
}

