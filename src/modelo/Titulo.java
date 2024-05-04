package modelo;

public class Titulo {
    private String nombre, sinopsis;
    private int fechaDeLanzamiento, duracionMinutos;
    private boolean incluidoEnElPlanBase;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isIncluidoEnElPlanBase() {
        return incluidoEnElPlanBase;
    }

    public void setIncluidoEnElPlanBase(boolean incluidoEnElPlanBase) {
        this.incluidoEnElPlanBase = incluidoEnElPlanBase;
    }

    public void muestraFichaTecnica(double promedio) {
        System.out.println("*****FICHA TECNICA*****");
        System.out.println("Nombre del titulo: " + nombre);
        System.out.println("fecha de lanzamiento de la pelicula: " + fechaDeLanzamiento);
        System.out.println("Tiempo de la duracion de la pelicula: " + getDuracionMinutos() + " minutos" );
        System.out.println("Promedio de evaluaciones de los usuarios: " + promedio + " de 5 estrellas \n");
    }

    public double calcularEvaluacion(double[] puntuaciones) {
        double suma = 0;

        if (puntuaciones.length == 0) {
            return 0;
        }

        for (double puntuacion : puntuaciones) {
            suma += puntuacion;
        }

        return suma / puntuaciones.length;
    }

}
