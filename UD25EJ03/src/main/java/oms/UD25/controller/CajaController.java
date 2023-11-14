package oms.UD25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oms.UD25.dto.Caja;
import oms.UD25.services.CajaServiceImpl;

@RestController
@RequestMapping("/cajas")
public class CajaController {
	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/all")
	public List<Caja> listarCajas(){
		return cajaServiceImpl.listarCajas();
	}
	
	
	@PostMapping("/add")
	public Caja salvarCaja(@RequestBody Caja caja) {
		
		return cajaServiceImpl.guardarCaja(caja);
	}
	
	
	@GetMapping("/{numReferencia}")
	public Caja cajaXID(@PathVariable(name="numReferencia") String id) {
		
		Caja caja_xid= new Caja();
		
		caja_xid=cajaServiceImpl.cajaXID(id);
		
		System.out.println("Caja XID: "+caja_xid);
		
		return caja_xid;
	}
	
	@PutMapping("/{numReferencia}")
	public Caja actualizarCaja(@PathVariable(name="numReferencia")String id,@RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= cajaServiceImpl.cajaXID(id);

		caja_seleccionado.setNumReferencia(caja.getNumReferencia());
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		caja_actualizado = cajaServiceImpl.actualizarCaja(caja_seleccionado);
		
		System.out.println("El caja actualizado es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/{numReferencia}")
	public void eliminarCaja(@PathVariable(name="numReferencia")String id) {
		cajaServiceImpl.eliminarCaja(id);
		System.out.println("Caja eliminado");
	}
}
