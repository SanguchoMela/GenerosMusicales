import java.util.Scanner;
public class menuPrincipal {
    public static void main(String[] args) {

        Genero rock = new Genero(
                "rock",
                "120bpm",
                1950,
                "EU",
                "Chuck Berry",
                "festival de California");
        Genero pop = new Genero(
                "pop",
                "50bpm",
                1950,
                "Gran Bretaña",
                "The Beatles",
                "Primavera Sound");
        Genero rockandroll = new Genero(
                "Rock and Roll",
                "100bpm",
                1950,
                "EU",
                "Elvis Presley",
                "Mad Cool Festival");
        Genero cumbia = new Genero(
                "cumbia",
                "80bpm",
                1960,
                "Colombia",
                "Joe Arroyo",
                "Festival de Cali");
        Genero merengue = new Genero(
                "merenge",
                "90bpm",
                1890,
                "Republica Dominicana",
                "Juan Luis Guerra",
                "Merengue Festival");


/*
        System.out.println(rock.getAnio());
        System.out.println(cumbia.getAnio());
        System.out.println(merengue.getAnio());

        //Es posible sumar con metodos
        System.out.println(rock.getAnio() + cumbia.getAnio() + merengue.getAnio());

        rock.setAnio(1900);
        pop.setArtista("Lady Gaga");
        rockandroll.setRitmo("95bpm");

        System.out.println(rock.getAnio());
        System.out.println(pop.getArtista());
        System.out.println(rockandroll.getRitmo());
*/

        //modificacion de datos por el usuario
        Scanner entrada = new Scanner(System.in);

        String nuevoArtista;

        System.out.print("Escriba el nombre del artista: ");
        nuevoArtista = entrada.nextLine();

        rock.setArtista(nuevoArtista);

        System.out.println("\nEl artista de rock ahora es: "+rock.getArtista());

        //imprimir datos
        System.out.println("\nLos datos del genero rock son: ");
        rock.imprimirDatos();

    }

}
