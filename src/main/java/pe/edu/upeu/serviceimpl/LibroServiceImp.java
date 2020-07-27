package pe.edu.upeu.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.serviceimpl.LibroServiceImp;
import pe.edu.upeu.dao.LibroDao;
import pe.edu.upeu.entity.Libro;
import pe.edu.upeu.service.LibroService;
@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroDao librodao;
	@Override
	public List<Libro> readAll() {
		return librodao.readAll();
	}

}