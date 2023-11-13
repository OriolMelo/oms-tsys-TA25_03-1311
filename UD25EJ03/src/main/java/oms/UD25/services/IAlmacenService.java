package oms.UD25.services;

import java.util.List;

import oms.UD25.dto.Almacen;

public interface IAlmacenService {
	//Metodos del CRUD
	public List<Almacen> listarAlmacenes(); //Listar All 
	
	public Almacen guardarAlmacen(Almacen almacen);	//Guarda un video CREATE
	
	public Almacen almacenXID(int id); //Leer datos de un video READ
	
	public Almacen actualizarAlmacen(Almacen almacen); //Actualiza datos del video UPDATE
	
	public void eliminarAlmacen(int id);// Elimina el video DELETE
}
