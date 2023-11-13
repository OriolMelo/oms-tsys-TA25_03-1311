package oms.UD25.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oms.UD25.dao.ICajaDAO;
import oms.UD25.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{
	@Autowired
	ICajaDAO iCajaDAO;
	
	@Override
	public List<Caja> listarCajas() {
		
		return iCajaDAO.findAll();
	}
	
	@Override
	public Caja guardarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(String ref) {
		
		return iCajaDAO.findById(ref).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String ref) {
		
		iCajaDAO.deleteById(ref);
		
	}
}
