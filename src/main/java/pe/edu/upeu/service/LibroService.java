package pe.edu.upeu.service;

import java.util.List;

import pe.edu.upeu.entity.Libro;



public interface LibroService {
	List<Libro> readAll();
}