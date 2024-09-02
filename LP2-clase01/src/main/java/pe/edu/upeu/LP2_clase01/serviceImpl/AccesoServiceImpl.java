package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upeu.LP2_clase01.entity.Acceso;
import pe.edu.upeu.LP2_clase01.service.AccesoService;

public class AccesoServiceImpl implements AccesoService {

	@Autowired
	private AccesoServiceImpl accesoDao;
	
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesoDao.create(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesoDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesoDao.delete(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return accesoDao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoDao.readAll();
	}

}
