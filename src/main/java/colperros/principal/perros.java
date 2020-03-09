
package colperros.principal;

/**
 * Maneja la informacion del colegio de Perros
 * @autores Jeimmy Solandry Naranjo, Sebastian Velazquez, Mario Dorado
 */
public class Perro {
    
    //Atributos
    
    private String Nombre;
    private String Raza;
    private String Localidad;
    private int Ceduladueño;
    private String NombreDueño;
    private int telefono;
    private String DiaAsistencia;
    
    //constructor

    public Perro(String Nombre, String Raza, String Localidad, int Ceduladueño, String NombreDueño, int telefono, String DiaAsistencia) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Localidad = Localidad;
        this.Ceduladueño = Ceduladueño;
        this.NombreDueño = NombreDueño;
        this.telefono = telefono;
        this.DiaAsistencia = DiaAsistencia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public int getCeduladueño() {
        return Ceduladueño;
    }

    public void setCeduladueño(int Ceduladueño) {
        this.Ceduladueño = Ceduladueño;
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDiaAsistencia() {
        return DiaAsistencia;
    }

    public void setDiaAsistencia(String DiaAsistencia) {
        this.DiaAsistencia = DiaAsistencia;
    }

    @Override
    public String toString() {
        return "perros{" + "Nombre= " + Nombre + ", Raza= " + Raza + ", Localidad= " + Localidad + ", Ceduladue= " + Ceduladueño + ", NombreDue= " + NombreDueño + ", telefono= " + telefono + ", DiaAsistencia= 11" + DiaAsistencia + '}';
    }
    
   
}
