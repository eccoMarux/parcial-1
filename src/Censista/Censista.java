package Censista;

public class Censista {
    // 1) TDA. Debido al censo nacional se desea determinar los datos de un
    // censista. Los datos del mismo son: dni,
    // teléfono, provincia, ciudad, area (identificada por un código de área),
    // totalViviendas, cantCensada
    private int dni, telefono, area, totalViviendas, cantCensadas;
    private String provincia, ciudad;

    // Contructores
    public Censista(int dni, int telefono, int area, int totalViviendas, int cantCensadas, String provincia,
            String ciudad) {
        this.dni = dni;
        this.telefono = telefono;
        this.area = area;
        this.totalViviendas = totalViviendas;
        this.cantCensadas = cantCensadas;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    public Censista(int dni) {
        this.dni = dni;
        this.telefono = 0;
        this.area = -1;
        this.totalViviendas = -1;
        this.cantCensadas = -1;
        this.provincia = " ";
        this.ciudad = " ";
    }

    // Observadoras
    public int getDni() {
        return this.dni;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public int getArea() {
        return this.area;
    }

    public int getTotalViviendas() {
        return this.totalViviendas;
    }

    public int getCantCensadas() {
        return this.cantCensadas;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    // Modificadoras
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setTotalViviendas(int totalViviendas) {
        this.totalViviendas = totalViviendas;
    }

    public void setCantCensadas(int cantCensadas) {
        this.cantCensadas = cantCensadas;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Propias del tipo
    public boolean equals(Censista objeto) {
        boolean iguales = false;
        if (this.dni == objeto.getDni()) {
            iguales = true;
        }
        return iguales;
    }

    public String toString() {
        String cadena;
        cadena = "Dni: " + this.dni + " \nTelefono: " + this.telefono + " \nArea: " + this.area +
                "\nTotal Viviendas: " + this.totalViviendas + "\nCantidad Censadas: " + this.cantCensadas +
                "\nProvincia: " + this.provincia + "\nCiudad: " + this.ciudad;
        return cadena;
    }

    public void censo(int cantViviendas) {
        this.cantCensadas = this.cantCensadas + cantViviendas;
    }

}
