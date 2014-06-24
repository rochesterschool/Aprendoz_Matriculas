
package com.aprendoz_desarrollo.data;



/**
 *  aprendoz_desarrollo.CostosAnualesCopy
 *  06/18/2014 18:10:25
 * 
 */
public class CostosAnualesCopy {

    private Integer idCostoAnua;
    private String codigo;
    private String nombreProducto;
    private String descripcion;
    private Double valor;
    private Boolean nuevo;
    private Boolean obligatorio;
    private Integer tipoCosto;
    private Grado grado;
    private Sy sy;

    public CostosAnualesCopy() {
    }

    public CostosAnualesCopy(Integer idCostoAnua, String codigo, String nombreProducto, String descripcion, Double valor, Boolean nuevo, Boolean obligatorio, Integer tipoCosto) {
        this.idCostoAnua = idCostoAnua;
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.valor = valor;
        this.nuevo = nuevo;
        this.obligatorio = obligatorio;
        this.tipoCosto = tipoCosto;
    }

    public CostosAnualesCopy(Integer idCostoAnua, String codigo, String nombreProducto, String descripcion, Double valor, Boolean nuevo, Boolean obligatorio, Integer tipoCosto, Grado grado, Sy sy) {
        this.idCostoAnua = idCostoAnua;
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.valor = valor;
        this.nuevo = nuevo;
        this.obligatorio = obligatorio;
        this.tipoCosto = tipoCosto;
        this.grado = grado;
        this.sy = sy;
    }

    public Integer getIdCostoAnua() {
        return idCostoAnua;
    }

    public void setIdCostoAnua(Integer idCostoAnua) {
        this.idCostoAnua = idCostoAnua;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean getNuevo() {
        return nuevo;
    }

    public void setNuevo(Boolean nuevo) {
        this.nuevo = nuevo;
    }

    public Boolean getObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(Boolean obligatorio) {
        this.obligatorio = obligatorio;
    }

    public Integer getTipoCosto() {
        return tipoCosto;
    }

    public void setTipoCosto(Integer tipoCosto) {
        this.tipoCosto = tipoCosto;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public Sy getSy() {
        return sy;
    }

    public void setSy(Sy sy) {
        this.sy = sy;
    }

}
