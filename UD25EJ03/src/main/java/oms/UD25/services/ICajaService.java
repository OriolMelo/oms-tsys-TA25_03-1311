package oms.UD25.services;

import java.util.List;

import oms.UD25.dto.Caja;

public interface ICajaService {
	//Metodos del CRUD
		public List<Caja> listarCajas(); //Listar All 
		
		public Caja guardarCaja(Caja caja);	//Guarda un video CREATE
		
		public Caja cajaXID(String ref); //Leer datos de un video READ
		
		public Caja actualizarCaja(Caja caja); //Actualiza datos del video UPDATE
		
		public void eliminarCaja(String ref);// Elimina el video DELETE
}
