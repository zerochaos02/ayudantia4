public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String ISBN;
    private int cantidadDisponible;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, String genero, String ISBN, int cantidadDisponible, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ISBN = ISBN;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = disponible;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() {
        if (cantidadDisponible > 0) {
            cantidadDisponible--;
            if (cantidadDisponible == 0) {
                disponible = false;
            }
        } else {
            System.out.println("No hay copias disponibles para prestar.");
        }
    }

    public void devolver() {
        cantidadDisponible++;
        if (cantidadDisponible > 0) {
            disponible = true;
        }
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Disponible: " + disponible);
    }
}