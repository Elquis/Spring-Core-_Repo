package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PagoAgente implements PagoI {
	
	@Autowired
	@Qualifier(value = "oracleDAO")
	DAOBaseI repositorio;

	@Override
	public void realizarpago() {
		// TODO Auto-generated method stub
		repositorio.conectar();
		
	}

}
