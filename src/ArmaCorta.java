public class ArmaCorta extends Arma {
    private Boolean esAutomatica;

    public ArmaCorta(Policia policiaAsociado, int cantidadMuniciones, double alcanceAproximado, String marca, double calibre, String estado, Boolean esAutomatica) {
        super(policiaAsociado, cantidadMuniciones, alcanceAproximado, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public Boolean getEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(Boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }

    @Override
    public boolean efectividadMts() {
        return this.getAlcanceAproximado() <= 200;
    }
}
