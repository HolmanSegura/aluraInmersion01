import modelo.Pelicula;
import modelo.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.muestraElMenu();

        /*
        double promedio;

        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");
        matrix.setDuracionMinutos(120);
        matrix.setFechaDeLanzamiento(1999);
        double[] matrixPuntuaciones = {4.5, 4.8, 3.0};
        promedio = matrix.calcularEvaluacion(matrixPuntuaciones);

        matrix.muestraFichaTecnica(promedio);

        Pelicula encanto = new Pelicula();
        encanto.setNombre("encanto");
        encanto.setDuracionMinutos(120);
        encanto.setFechaDeLanzamiento(2022);
        double[] encantoPuntuaciones = {1.7, 3.5, 5.0};
        promedio = encanto.calcularEvaluacion(encantoPuntuaciones);

        encanto.muestraFichaTecnica(promedio);

        Serie friends = new Serie();
        friends.setNombre("Friends");
        friends.setFechaDeLanzamiento(1996);
        friends.setTemporadas(10);
        friends.setEpisodiosPorTemporada(22);
        friends.setDuracionEnMinutosPorEpisodio(30);
        double[] friendsPuntuaciones = {4.5, 4.8, 4.2};
        promedio = encanto.calcularEvaluacion(friendsPuntuaciones);

        friends.muestraFichaTecnica(promedio);
        */
        /*//Declaracion de variables
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
        System.out.println("modelo.Pelicula " + nombrePelicula);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Puntuacion: " + evaluacion);
        System.out.println("Incluido en el plan: " + incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Promedio de puntuacion: " + mediaEvaluacion);

        if (fechaDeLanzamiento < 2023) {
            System.out.println("modelo.Pelicula popular en el momento");
        } else {
            System.out.println("modelo.Pelicula retro que vale la pena ver");
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

        System.out.println(comentarios);*/
    }
}