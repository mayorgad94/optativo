package cl.pruebas.ws;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import cl.prueba.datos.Reporte;
import cl.prueba.datos.Usuario;
import cl.prueba.ejb.PrimerEJB;

@WebService
public class PruebaWS {

	@EJB
	private PrimerEJB oEjb;
	// SoapUI
	@WebMethod
	public Usuario login(
			@WebParam(name="nombre")
			String sNombre, String sPassword){
		return oEjb.login(sNombre, sPassword);
	}
	
	@WebMethod
	public boolean reporte (
			@WebParam(name="dato")
			Reporte reporte){
		return oEjb.registrarReporte(reporte);
	}
	
}

