public abstract class Arma {
    private Policia policiaAsociado;
    private int cantidadMuniciones;
    private double alcanceAproximado;
    private String marca;
    private double calibre;
    private String estado;

    public Arma(Policia policiaAsociado, int cantidadMuniciones, double alcanceAproximado, String marca, double calibre, String estado) {
        this.policiaAsociado = policiaAsociado;
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceAproximado = alcanceAproximado;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    // Getters y setters
    public Policia getPoliciaAsociado() {
        return policiaAsociado;
    }

    public void setPoliciaAsociado(Policia policiaAsociado) {
        this.policiaAsociado = policiaAsociado;
    }

    public int getCantidadMuniciones() {
        return cantidadMuniciones;
    }

    public void setCantidadMuniciones(int cantidadMuniciones) {
        this.cantidadMuniciones = cantidadMuniciones;
    }

    public double getAlcanceAproximado() {
        return alcanceAproximado;
    }

    public void setAlcanceAproximado(double alcanceAproximado) {
        this.alcanceAproximado = alcanceAproximado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean estaEnCondiciones() {
        return estado.equals("en uso") && calibre >= 9;
    }

    public abstract boolean efectividadMts();
}
