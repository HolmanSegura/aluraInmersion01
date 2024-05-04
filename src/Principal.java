import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);

    public void muestraElMenu() {
        int opcion = 0;
        while (opcion != 9) {
            mostrarMenu();
            opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea después del entero
            switch (opcion) {
                case 1:
                    registrarPelicula();
                    break;
                case 2:
                    registrarSerie();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("""
                Bienvenido(a) a Screemmarch
                1) Registrar nueva película
                2) Registrar nueva serie
                
                9) Salir
                """);
    }

    private void registrarPelicula() {
        System.out.println("Ingrese el nombre de la película: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la película: ");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la duración en minutos de la película: ");
        int duracionEnMinutos = teclado.nextInt();
        teclado.nextLine();
        double[] peliculaPuntuaciones = ingresarPuntuaciones();
        Pelicula peliculaUsuario = new Pelicula();
        peliculaUsuario.setNombre(nombre);
        peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
        peliculaUsuario.setDuracionMinutos(duracionEnMinutos);
        double promedio = peliculaUsuario.calcularEvaluacion(peliculaPuntuaciones);
        peliculaUsuario.muestraFichaTecnica(promedio);
    }

    private void registrarSerie() {
        System.out.println("Ingrese el nombre de la serie: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la serie: ");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de temporadas de la serie: ");
        int temporadas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de episodios por temporada: ");
        int episodiosPorTemporada = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la duración promedio de los episodios: ");
        int duracionPorEpisodio = teclado.nextInt();
        teclado.nextLine();
        double[] seriePuntuaciones = ingresarPuntuaciones();
        Serie serieUsuario = new Serie();
        serieUsuario.setTemporadas(temporadas);
        serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
        serieUsuario.setDuracionEnMinutosPorEpisodio(duracionPorEpisodio);
        serieUsuario.setNombre(nombre);
        serieUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
        double promedio = serieUsuario.calcularEvaluacion(seriePuntuaciones);
        serieUsuario.muestraFichaTecnica(promedio);
    }

    private double[] ingresarPuntuaciones() {
        System.out.println("Ingrese cuántas puntuaciones desea ponerle: ");
        int numeroDePuntuaciones = teclado.nextInt();
        teclado.nextLine();
        double[] puntuaciones = new double[numeroDePuntuaciones];
        for (int i = 0; i < numeroDePuntuaciones; i++) {
            System.out.println("Ingrese la puntuación número " + (i + 1) + " del 0.0 al 5.0: ");
            puntuaciones[i] = teclado.nextDouble();
            teclado.nextLine();
        }
        return puntuaciones;
    }
}
