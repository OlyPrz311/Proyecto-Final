package L_Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import L_Model.Libro;

public class Libreria_Servicios {
    
    private final String tabla = "Libros";
    
    public void guardar(Connection conexion2, Libro libro) throws SQLException{
        try{
            PreparedStatement consultar;
            if(libro.getID_libro() == null){
                consultar = conexion2.prepareStatement("INSERT INTO " + this.tabla + "(ISBN, titulo, fecha_elaboracion, precio, nombre_edit, nombre_autor, ape_autor) VALUES(?, ?, ?, ?, ?, ?)");  //CHECAR SI HAY ERROR AL INSERTAR, PROBAR AÑADIENDOLE AL "INSERT" UN NULL A LA COLUMNA ID_Libro
                consultar.setString(1, libro.getISBN());
                consultar.setString(2, libro.getTitulo());
                consultar.setString(3, libro.getFecha_elaboracion());
                consultar.setInt(4, libro.getPrecio());
                consultar.setString(5, libro.getNombre_edit());
                consultar.setString(6, libro.getNombre_autor());
                consultar.setString(7, libro.getApe_autor());
            }else{
                consultar = conexion2.prepareStatement("UPDATE " + this.tabla + " SET ISBN = ?, titulo = ?, fecha_elaboracion = ?, precio = ?, nombre_edit = ?, nombre_autor = ?, ape_autor = ? WHERE ID_Libro = ?");
                consultar.setString(1, libro.getISBN());
                consultar.setString(2, libro.getTitulo());
                consultar.setString(3, libro.getFecha_elaboracion());
                consultar.setInt(4, libro.getPrecio());
                consultar.setString(5, libro.getNombre_edit());
                consultar.setString(6, libro.getNombre_autor());
                consultar.setString(7, libro.getApe_autor());
                consultar.setInt(8, libro.getID_libro());
            }
            consultar.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public Libro enlistarPorId(Connection conexion1, int ID_Libro) throws SQLException{
        Libro libro = null;
        try{
            PreparedStatement consultar = conexion1.prepareStatement("SELECT ISBN, titulo, fecha_elaboracion, precio, nombre_edit, nombre_autor, ape_autor FROM " + this.tabla + " WHERE ID_Libro = ?" );
            consultar.setInt(1, ID_Libro);
            ResultSet respuesta = consultar.executeQuery();
            while(respuesta.next()){
                libro = new Libro(ID_Libro, respuesta.getString("ISBN"), respuesta.getString("titulo"), respuesta.getString("fecha_elaboracion"), respuesta.getInt("precio"), respuesta.getString("nombre_edit"), respuesta.getString("nombre_autor"), respuesta.getString("ape_autor"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return libro;
    }
    
    public void Eliminar(Connection conexion1, Libro libro) throws SQLException{
        try{
            PreparedStatement consultar = conexion1.prepareStatement("DELETE FROM " + this.tabla + " WHERE ID_Libro = ?");
            consultar.setInt(1, libro.getID_libro());
            consultar.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public List<Libro> Recuperar(Connection conexion1) throws SQLException{
        List<Libro> libros = new ArrayList<>();  //al declarar "libros" despues del array es el nombre de la tabla en la BD
        try{
            PreparedStatement consultar = conexion1.prepareStatement("SELECT ID_Libro, ISBN, titulo, fecha_elaboracion, precio, nombre_edit, nombre_autor, ape_autor FROM " + this.tabla + " ORDER BY ID_Libro");
            ResultSet respuesta = consultar.executeQuery();
            while(respuesta.next()){
                libros.add(new Libro(respuesta.getInt("ID_Libro"), respuesta.getString("ISBN"), respuesta.getString("titulo"), respuesta.getString("fecha_elaboracion"), respuesta.getInt("precio"), respuesta.getString("nombre_edit"), respuesta.getString("nombre_autor"), respuesta.getString("ape_autor")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return libros;
    }
    
}
