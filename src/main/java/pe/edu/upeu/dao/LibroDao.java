package pe.edu.upeu.dao;

import java.util.List;

import pe.edu.upeu.entity.Libro;


public interface LibroDao {
	List<Libro> readAll();
}