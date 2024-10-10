public class Main {
    public static void main(String[] args) {
        // 1. Crear un objeto de la clase Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear varios objetos de la clase Libro y agregarlos a la biblioteca
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "Novela", "1234567890", 3, true);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Novela", "0987654321", 2, true);
        Libro libro3 = new Libro("Don Juan Tenorio", "José Zorrilla", "Teatro", "1122334455", 1, true);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // 3. Mostrar la lista de libros disponibles
        System.out.println("Lista de libros disponibles:");
        biblioteca.mostrarLibrosDisponibles();

        // 4. Prestar un libro y volver a mostrar la lista de libros disponibles
        System.out.println("\nPrestando el libro 'El Quijote':");
        biblioteca.prestarLibro("El Quijote");
        System.out.println("Lista de libros disponibles después de prestar 'El Quijote':");
        biblioteca.mostrarLibrosDisponibles();

        // 5. Devolver un libro y mostrar nuevamente la lista de libros disponibles
        System.out.println("\nDevolviendo el libro 'El Quijote':");
        biblioteca.devolverLibro("El Quijote");
        System.out.println("Lista de libros disponibles después de devolver 'El Quijote':");
        biblioteca.mostrarLibrosDisponibles();

        // 6. Buscar un libro por su título
        System.out.println("\nBuscando el libro 'Cien Años de Soledad':");
        biblioteca.buscarLibroPorTitulo("Cien Años de Soledad");

        // 7. Buscar libros de un autor específico
        System.out.println("\nBuscando libros del autor 'Gabriel García Márquez':");
        biblioteca.buscarLibrosPorAutor("Gabriel García Márquez");

        // 8. Eliminar un libro de la biblioteca y mostrar la lista actualizada de libros
        System.out.println("\nEliminando el libro 'Don Juan Tenorio':");
        biblioteca.eliminarLibro("Don Juan Tenorio");
        System.out.println("Lista de libros después de eliminar 'Don Juan Tenorio':");
        biblioteca.mostrarLibrosDisponibles();
    }
}
