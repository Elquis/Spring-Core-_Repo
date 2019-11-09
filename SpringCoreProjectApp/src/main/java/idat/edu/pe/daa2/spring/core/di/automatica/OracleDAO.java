package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class OracleDAO implements DAOBaseI{

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.print("conectado a la base de datos oracle");
	}

}
