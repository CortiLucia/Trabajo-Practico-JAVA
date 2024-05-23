public class ArmaLarga extends Arma {
    private boolean tieneSelloRenar;
    private String descripcion;
    private int nivelArma;

    public ArmaLarga(Policia policiaAsociado, int cantidadMuniciones, double alcanceAproximado, String marca, double calibre, String estado, boolean tieneSelloRenar, String descripcion, int nivelArma) {
        super(policiaAsociado, cantidadMuniciones, alcanceAproximado, marca, calibre, estado);
        this.tieneSelloRenar = tieneSelloRenar;
        this.descripcion = descripcion;
        this.nivelArma = nivelArma;
    }

    public boolean isTieneSelloRenar() {
        return tieneSelloRenar;
    }

    public void setTieneSelloRenar(boolean tieneSelloRenar) {
        this.tieneSelloRenar = tieneSelloRenar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelArma() {
        return nivelArma;
    }

    public void setNivelArma(int nivelArma) {
        this.nivelArma = nivelArma;
    }

    public boolean esMayor(ArmaLarga otraArma) {
        return this.nivelArma > otraArma.getNivelArma();
    }

    @Override
    public boolean efectividadMts() {
        return this.getAlcanceAproximado() > 200;
    }
}
