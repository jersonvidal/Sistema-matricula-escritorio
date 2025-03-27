package arreglos;

import java.io.*;



import java.util.ArrayList;
import clases.Curso;

public class ArregloCurso {
    private ArrayList<Curso> ac;

    public ArregloCurso() {
        ac = new ArrayList<>();
        cargarCursos();
    }

    public void adicionar(Curso x) {
        ac.add(x);
        grabarCursos();
    }

    public void eliminar(Curso x) {
        ac.remove(x);
        grabarCursos();
    }

    public int tamanio() {
        return ac.size();
    }

    public Curso obtener(int i) {
        return ac.get(i);
    }

    public Curso buscar(int codigo) {
        for (int i = 0; i < ac.size(); i++) {
            if (ac.get(i).getCodigoCurso() == codigo)
                return ac.get(i);
        }
        return null;
    }

    public int codigoCorrelativo() {
        if (ac.isEmpty()) return 3001;
        return ac.get(ac.size() - 1).getCodigoCurso() + 1;
    }

    public void actualizarArchivo() {
        grabarCursos();
    }

    private void grabarCursos() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("cursos.txt"))) {
            for (Curso x : ac) {
                String linea = x.getCodigoCurso() + ";" +
                        x.getAsignatura() + ";" +
                        x.getHora();
                pw.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarCursos() {
        try (BufferedReader br = new BufferedReader(new FileReader("cursos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] s = linea.split(";");
                int codCurso = Integer.parseInt(s[0].trim());
                String asignatura = s[1].trim();
                int horas = Integer.parseInt(s[2].trim());
                Curso curso = new Curso(codCurso, asignatura, horas);
                if (curso != null) {
                    adicionar(curso);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void eliminarAsignacionDocente(int codigoCurso) {
  		for (int i=0; i<tamanio(); i++)
  			if (obtener(i).getCodigoCurso() == codigoCurso)
  				 obtener(i).setCodigoCurso(codigoCurso);
  	}
  	
    
    
    
}