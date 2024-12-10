public class Conductor {
    private String nombre;
    public boolean tieneInfraccion=false;

    public Conductor(String nombre, boolean tieneInfraccion) {
        this.nombre = nombre;
        this.tieneInfraccion = tieneInfraccion;
    }

    public boolean isTieneInfraccion() {
        return tieneInfraccion;
    }

    public void setTieneInfraccion(boolean tieneInfraccion) {
        this.tieneInfraccion = tieneInfraccion;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", tieneInfraccion=" + tieneInfraccion +
                '}';
    }
}
