package org.iesvdm.service;

import java.util.List;

import org.iesvdm.domain.Categoria;
import org.iesvdm.dto.CategoriaDTO;
import org.iesvdm.dto.CategoriaDTO2;
import org.iesvdm.repository.CategoriaRepository;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService {
	
	CategoriaRepository categoriaRepository;
	
	public CategoriaService(CategoriaRepository categoriaRepository) {
		super();
		this.categoriaRepository = categoriaRepository;
	}

	public Categoria one(Long id) {
		return categoriaRepository.find(id); 
	}
	
	public CategoriaDTO oneDTO(Long id) {
		return categoriaRepository.findDTO(id); 
	}
	
	public List<CategoriaDTO2> listaDTO2(Long id) {
		return categoriaRepository.findDTOCountAlm(id);
	}

}
