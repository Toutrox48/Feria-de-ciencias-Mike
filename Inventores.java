public class Inventores extends EnfoqueInventor {

    String nombre;
    int edad;
    private int nivel_creatividad;
    String invento;
    EnfoqueInventor enfoque;

    public Inventores(String nombre, int edad, int nivel_creatividad, String invento, String nombre_enfoque, String tipo_presentacion) {
        super(nombre_enfoque, tipo_presentacion);
        this.nombre = nombre;
        this.edad = edad;
        this.nivel_creatividad = nivel_creatividad;
        this.invento = invento;
    }

    public int SumarPuntos(int puntos) {
        return nivel_creatividad + puntos;
    }

    public void presentarInvento() {
        System.out.println("Presentación de " + nombre + ":");
        System.out.println("Invento: " + invento);
        System.out.println("Enfoque: " + enfoque.nombre_enfoque);
        System.out.println("Tipo de presentación: " + enfoque.tipo_presentacion);
    }
}