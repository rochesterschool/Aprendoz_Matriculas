
package com.aprendoz_desarrollo.data;

import java.util.HashSet;
import java.util.Set;


/**
 *  aprendoz_desarrollo.TransporteRutas
 *  06/18/2014 18:10:25
 * 
 */
public class TransporteRutas {

    private Integer idRuta;
    private String numeroRuta;
    private String placaVehiculo;
    private String nombreConductor;
    private String telefonoConductor;
    private String movilConductor;
    private String nombreMonitora;
    private String telefonoMonitor;
    private String movilMonitor;
    private String idAvantel;
    private String numeroAvantel;
    private String nombreResponsable;
    private String descripcion;
    private String telefono1;
    private String telefono2;
    private GrupoFamiliar grupoFamiliar;
    private TipoTransporte tipoTransporte;
    private Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForMartesRuta = new HashSet<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte>();
    private Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForMiercolesRuta = new HashSet<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte>();
    private Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForJuevesRuta = new HashSet<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte>();
    private Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForViernesRuta = new HashSet<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte>();
    private Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForSabadoRuta = new HashSet<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte>();
    private Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForDomingoRuta = new HashSet<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte>();
    private Set<com.aprendoz_desarrollo.data.TransporteNovedades> transporteNovedadeses = new HashSet<com.aprendoz_desarrollo.data.TransporteNovedades>();
    private Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForLunesRuta = new HashSet<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte>();

    public TransporteRutas() {
    }

    public TransporteRutas(Integer idRuta, String numeroRuta, String placaVehiculo, String nombreConductor, String telefonoConductor, String movilConductor, String nombreMonitora, String telefonoMonitor, String movilMonitor, String idAvantel, String numeroAvantel, String nombreResponsable, String descripcion, String telefono1, String telefono2) {
        this.idRuta = idRuta;
        this.numeroRuta = numeroRuta;
        this.placaVehiculo = placaVehiculo;
        this.nombreConductor = nombreConductor;
        this.telefonoConductor = telefonoConductor;
        this.movilConductor = movilConductor;
        this.nombreMonitora = nombreMonitora;
        this.telefonoMonitor = telefonoMonitor;
        this.movilMonitor = movilMonitor;
        this.idAvantel = idAvantel;
        this.numeroAvantel = numeroAvantel;
        this.nombreResponsable = nombreResponsable;
        this.descripcion = descripcion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    public TransporteRutas(Integer idRuta, String numeroRuta, String placaVehiculo, String nombreConductor, String telefonoConductor, String movilConductor, String nombreMonitora, String telefonoMonitor, String movilMonitor, String idAvantel, String numeroAvantel, String nombreResponsable, String descripcion, String telefono1, String telefono2, GrupoFamiliar grupoFamiliar, TipoTransporte tipoTransporte, Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForMartesRuta, Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForMiercolesRuta, Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForJuevesRuta, Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForViernesRuta, Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForSabadoRuta, Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForDomingoRuta, Set<com.aprendoz_desarrollo.data.TransporteNovedades> transporteNovedadeses, Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForLunesRuta) {
        this.idRuta = idRuta;
        this.numeroRuta = numeroRuta;
        this.placaVehiculo = placaVehiculo;
        this.nombreConductor = nombreConductor;
        this.telefonoConductor = telefonoConductor;
        this.movilConductor = movilConductor;
        this.nombreMonitora = nombreMonitora;
        this.telefonoMonitor = telefonoMonitor;
        this.movilMonitor = movilMonitor;
        this.idAvantel = idAvantel;
        this.numeroAvantel = numeroAvantel;
        this.nombreResponsable = nombreResponsable;
        this.descripcion = descripcion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.grupoFamiliar = grupoFamiliar;
        this.tipoTransporte = tipoTransporte;
        this.transporteInscAlumTransportesForMartesRuta = transporteInscAlumTransportesForMartesRuta;
        this.transporteInscAlumTransportesForMiercolesRuta = transporteInscAlumTransportesForMiercolesRuta;
        this.transporteInscAlumTransportesForJuevesRuta = transporteInscAlumTransportesForJuevesRuta;
        this.transporteInscAlumTransportesForViernesRuta = transporteInscAlumTransportesForViernesRuta;
        this.transporteInscAlumTransportesForSabadoRuta = transporteInscAlumTransportesForSabadoRuta;
        this.transporteInscAlumTransportesForDomingoRuta = transporteInscAlumTransportesForDomingoRuta;
        this.transporteNovedadeses = transporteNovedadeses;
        this.transporteInscAlumTransportesForLunesRuta = transporteInscAlumTransportesForLunesRuta;
    }

    public Integer getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Integer idRuta) {
        this.idRuta = idRuta;
    }

    public String getNumeroRuta() {
        return numeroRuta;
    }

    public void setNumeroRuta(String numeroRuta) {
        this.numeroRuta = numeroRuta;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getTelefonoConductor() {
        return telefonoConductor;
    }

    public void setTelefonoConductor(String telefonoConductor) {
        this.telefonoConductor = telefonoConductor;
    }

    public String getMovilConductor() {
        return movilConductor;
    }

    public void setMovilConductor(String movilConductor) {
        this.movilConductor = movilConductor;
    }

    public String getNombreMonitora() {
        return nombreMonitora;
    }

    public void setNombreMonitora(String nombreMonitora) {
        this.nombreMonitora = nombreMonitora;
    }

    public String getTelefonoMonitor() {
        return telefonoMonitor;
    }

    public void setTelefonoMonitor(String telefonoMonitor) {
        this.telefonoMonitor = telefonoMonitor;
    }

    public String getMovilMonitor() {
        return movilMonitor;
    }

    public void setMovilMonitor(String movilMonitor) {
        this.movilMonitor = movilMonitor;
    }

    public String getIdAvantel() {
        return idAvantel;
    }

    public void setIdAvantel(String idAvantel) {
        this.idAvantel = idAvantel;
    }

    public String getNumeroAvantel() {
        return numeroAvantel;
    }

    public void setNumeroAvantel(String numeroAvantel) {
        this.numeroAvantel = numeroAvantel;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public GrupoFamiliar getGrupoFamiliar() {
        return grupoFamiliar;
    }

    public void setGrupoFamiliar(GrupoFamiliar grupoFamiliar) {
        this.grupoFamiliar = grupoFamiliar;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> getTransporteInscAlumTransportesForMartesRuta() {
        return transporteInscAlumTransportesForMartesRuta;
    }

    public void setTransporteInscAlumTransportesForMartesRuta(Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForMartesRuta) {
        this.transporteInscAlumTransportesForMartesRuta = transporteInscAlumTransportesForMartesRuta;
    }

    public Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> getTransporteInscAlumTransportesForMiercolesRuta() {
        return transporteInscAlumTransportesForMiercolesRuta;
    }

    public void setTransporteInscAlumTransportesForMiercolesRuta(Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForMiercolesRuta) {
        this.transporteInscAlumTransportesForMiercolesRuta = transporteInscAlumTransportesForMiercolesRuta;
    }

    public Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> getTransporteInscAlumTransportesForJuevesRuta() {
        return transporteInscAlumTransportesForJuevesRuta;
    }

    public void setTransporteInscAlumTransportesForJuevesRuta(Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForJuevesRuta) {
        this.transporteInscAlumTransportesForJuevesRuta = transporteInscAlumTransportesForJuevesRuta;
    }

    public Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> getTransporteInscAlumTransportesForViernesRuta() {
        return transporteInscAlumTransportesForViernesRuta;
    }

    public void setTransporteInscAlumTransportesForViernesRuta(Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForViernesRuta) {
        this.transporteInscAlumTransportesForViernesRuta = transporteInscAlumTransportesForViernesRuta;
    }

    public Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> getTransporteInscAlumTransportesForSabadoRuta() {
        return transporteInscAlumTransportesForSabadoRuta;
    }

    public void setTransporteInscAlumTransportesForSabadoRuta(Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForSabadoRuta) {
        this.transporteInscAlumTransportesForSabadoRuta = transporteInscAlumTransportesForSabadoRuta;
    }

    public Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> getTransporteInscAlumTransportesForDomingoRuta() {
        return transporteInscAlumTransportesForDomingoRuta;
    }

    public void setTransporteInscAlumTransportesForDomingoRuta(Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForDomingoRuta) {
        this.transporteInscAlumTransportesForDomingoRuta = transporteInscAlumTransportesForDomingoRuta;
    }

    public Set<com.aprendoz_desarrollo.data.TransporteNovedades> getTransporteNovedadeses() {
        return transporteNovedadeses;
    }

    public void setTransporteNovedadeses(Set<com.aprendoz_desarrollo.data.TransporteNovedades> transporteNovedadeses) {
        this.transporteNovedadeses = transporteNovedadeses;
    }

    public Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> getTransporteInscAlumTransportesForLunesRuta() {
        return transporteInscAlumTransportesForLunesRuta;
    }

    public void setTransporteInscAlumTransportesForLunesRuta(Set<com.aprendoz_desarrollo.data.TransporteInscAlumTransporte> transporteInscAlumTransportesForLunesRuta) {
        this.transporteInscAlumTransportesForLunesRuta = transporteInscAlumTransportesForLunesRuta;
    }

}
