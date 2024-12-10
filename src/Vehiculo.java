public abstract class Vehiculo {
    protected float precioApagar;
    protected Conductor conductor;

    public abstract float precioPeajeApagar();

    public Vehiculo( Conductor conductor) {
        this.conductor = conductor;
    }



    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void asignarConductor(Conductor c){
        this.conductor =c;

    }
    public Conductor mostrarConductor(){
        return conductor;
    }
}
