package L_Model;


public class Usuarios {
    private final Integer id_usuario;
    private String nombre_usuario;
    private String ape_usuario;
    private String alias;
    private String tipo;
    private String clave;
    
    public Usuarios(){
        this.id_usuario = null;
        this.nombre_usuario = null;
        this.ape_usuario = null;
        this.alias = null;
        this.tipo = null;
        this.clave = null;
    }

    public Usuarios(Integer id_usuario, String nombre_usuario, String ape_usuario, String alias, String tipo, String clave) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.ape_usuario = ape_usuario;
        this.alias = alias;
        this.tipo = tipo;
        this.clave = clave;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApe_usuario() {
        return ape_usuario;
    }

    public void setApe_usuario(String ape_usuario) {
        this.ape_usuario = ape_usuario;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
