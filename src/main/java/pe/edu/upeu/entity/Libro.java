package pe.edu.upeu.entity;

public class Libro {
	 private int idlibro;
	    private String titulo;
	    private String autor;
	    private String editorial;
	    private String fecha;
		public Libro() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Libro(int idlibro, String titulo, String autor, String editorial, String fecha) {
			super();
			this.idlibro = idlibro;
			this.titulo = titulo;
			this.autor = autor;
			this.editorial = editorial;
			this.fecha = fecha;
		}
		public int getIdlibro() {
			return idlibro;
		}
		public void setIdlibro(int idlibro) {
			this.idlibro = idlibro;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public String getEditorial() {
			return editorial;
		}
		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}
		public String getFecha() {
			return fecha;
		}
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
	    
	    
}
