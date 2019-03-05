package cuentas;
/**
 * 
 * @author plane
 * @version 1.0
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter�s;
    /**
     * constructor
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parametros
     * @param nom nombre de la cuenta
     * @param cue detalle de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de inter�s, se omite
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Metodo que devuelve el saldo
     * @return
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Metodo para ingresar dinero
     * @param cantidad dinero a ingresar
     * @throws Exception error al ejecutar la opreaci�n
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Metodo para retirar dinero
     * @param cantidad dinero a retirar
     * @throws Exception error al ejecutar la operaci�n
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the tipoInter�s
	 */
	public double getTipoInter�s() {
		return tipoInter�s;
	}
	/**
	 * @param tipoInter�s the tipoInter�s to set
	 */
	public void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}

	
}
