import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner teclado = new Scanner(System.in);
        int fechaDeLanzamiento = 1999;
        String nombrePelicula = "Matrix";
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String sinopsis = """
                La mejor pelicula de fin de milenio
                """;
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        double mediaEvaluacionUsuario = 0 ;
        String comentario = "";
        int numeroDeComentarios = 1;
        ArrayList comentarios = new ArrayList();

        //Impresion de variables
        System.out.println("Bienvenidos a la inmersion en java");
        System.out.println("Pelicula " + nombrePelicula);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Puntuacion: " + evaluacion);
        System.out.println("Incluido en el plan: " + incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Promedio de puntuacion: " + mediaEvaluacion);

        if (fechaDeLanzamiento < 2023) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor ingresa tu puntuacion para matrix: ");
            double notaPelicula = teclado.nextDouble();
            teclado.nextLine();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaPelicula;
        }

        System.out.println("Promedio dado: " + mediaEvaluacionUsuario / 3);

        //ciclo while para ingresar comentarios de la pelicula
        while (numeroDeComentarios <= 3) {
            System.out.println("Ingrese el comentario numero " + numeroDeComentarios);
            comentario = teclado.nextLine();
            comentarios.add(comentario);
            numeroDeComentarios++;
        }

        System.out.println(comentarios);
    }
}