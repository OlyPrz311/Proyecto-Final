package L_Model;

public class Libro {
    private Integer ID_libro;   
    private String ISBN;
    private String titulo;
    private String fecha_elaboracion;
    private Integer precio;
    private String nombre_edit;
    private String nombre_autor;
    private String ape_autor;

    public Libro(){
        this.ID_libro = null;
        this.ISBN = null;
        this.titulo = null;
        this.fecha_elaboracion = null;
        this.precio = null;
        this.nombre_edit = null;
        this.nombre_autor = null;
        this.ape_autor = null;
    }
    
    
    public Libro(Integer id_libro, String ISBN, String titulo, String fecha_elaboracion, Integer precio, String nombre_edit, String nombre_autor, String ape_autor) {
        this.ID_libro = id_libro;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.fecha_elaboracion = fecha_elaboracion;
        this.precio = precio;
        this.nombre_edit = nombre_edit;
        this.nombre_autor = nombre_autor;
        this.ape_autor = ape_autor;
    }
    
    public Integer getID_libro(){
        return ID_libro;
    }
    
    public void setID_libro(Integer ID_libro){
        this.ID_libro = ID_libro;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(String fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNombre_edit() {
        return nombre_edit;
    }

    public void setNombre_edit(String nombre_edit) {
        this.nombre_edit = nombre_edit;
    }

    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public String getApe_autor() {
        return ape_autor;
    }

    public void setApe_autor(String ape_autor) {
        this.ape_autor = ape_autor;
    }
    
    @Override
    public String toString(){
        return "Libro{" + "ID_libro" + ID_libro + ", ISBN" + ISBN + ", titulo" + titulo + ", fecha_elaboracion" + fecha_elaboracion + ", precio" + precio + ", nombre_edit" + nombre_edit + ", nombre_autor" + nombre_autor + ", ape_autor" + ape_autor + '}';
    }
    
}
