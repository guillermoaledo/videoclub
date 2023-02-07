package org.iesvdm.dto;

import java.util.Date;

import org.iesvdm.domain.Categoria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO2 extends Categoria{

	private int id_almacen;
	
	private int conteoPeliculasAlm;
	
	public CategoriaDTO2(long id, String nombre, Date ultimaActualizacion, int id_almacen, int conteoPeliculasAlm) {
		super(id, nombre, ultimaActualizacion);
		this.id_almacen = id_almacen;
		this.conteoPeliculasAlm = conteoPeliculasAlm;
	}
}
