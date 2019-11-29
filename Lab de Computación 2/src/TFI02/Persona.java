package TFI02;

public abstract class Persona {

    private int legajo;
    private String nombre;

    public Persona(int legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre+"("+this.legajo+")";
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int dni) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void modificarDatos();

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + legajo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (legajo != other.legajo)
            return false;
        return true;
    }

}
