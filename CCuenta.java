package cuentas;
public class CCuenta {


	/**
	 * @author Alberto Pradillo
	 * @since 2023
	 * @version 1.0
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    /**
     * Metodo Constructor vacío
     */
    public CCuenta()
    {
    }

    /**
     * 
     * @param nom Indica el nombre de la cuenta
     * @param cue Indica 
     * @param sal Indica el saldo que tiene la cuenta al crearla
     * @param tipo Indica el tipo de cuenta
     * @param cantidad Indica
     */
    public CCuenta(String nom, String cue, double sal, double tipo, float cantidad)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * 
     * @return Retorna el estado en que se encuentra la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    
    /**
     * 
     * @param cantidad Indica la cantidad, incluidos decimales, que vas a ingresar en la cuenta
     * @throws Exception Excepción que indica la imposibilidad de realizar el ingreso de la cantidad indicada de la cuenta
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * @param cantidad Indica la cantidad a retirar, con decimales, de la cuenta bancaria
     * @throws Exception Excepción que indica la imposibilidad de realizar la retirada de la cantidad indicada de la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * 
     * @return Retorna el nombre de la cuenta
     */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Indica el nuevo nombre que tendrá la cuenta a partir de este momento
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * 
	 * @return Retornael saldo que tiene actualmente la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * @param saldo Indica el nuevo saldo que tendrá la cuenta a partir de este momento
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return Retorna el tipo de intereas que tiene la cuenta
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * 
	 * @param tipoInterés Indica el nuevo tipo de interés que tendrá la cuenta a partir este momento
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}


    

}
