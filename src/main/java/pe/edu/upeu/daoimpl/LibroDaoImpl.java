package pe.edu.upeu.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.dao.LibroDao;
import pe.edu.upeu.entity.Libro;

@Repository
public class LibroDaoImpl implements LibroDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public List<Libro> readAll() {
		return jdbctemplate.query("select * from libro", 	BeanPropertyRowMapper.newInstance(Libro.class));						
	}
}
