package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class PagoAgencia implements PagoI {
	@Autowired
	DAOBaseI Repositorio;

	@Override
	public void realizarpago() {
		// TODO Auto-generated method stub
		Repositorio.conectar();
		
	}
	

}
