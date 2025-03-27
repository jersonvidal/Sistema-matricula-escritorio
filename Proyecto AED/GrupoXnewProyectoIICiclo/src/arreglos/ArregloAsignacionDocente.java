package arreglos;

import java.io.*;
import java.util.ArrayList;
import clases.AsignacionDocente;

public class ArregloAsignacionDocente {

    // Atributo privado
    private ArrayList<AsignacionDocente> asi;

    // Constructor
    public ArregloAsignacionDocente() {
        asi = new ArrayList<>();
        cargarAsignaciones();
    }

    public void adicionar(AsignacionDocente x) {
        asi.add(x);
        grabarAsignaciones();
    }

    public int tamanio() {
        return asi.size();
    }

    public AsignacionDocente obtener(int i) {
        return asi.get(i);
    }

    public AsignacionDocente buscar(int codigoAsignacion) {
        for (int i = 0; i < tamanio(); i++)
            if (obtener(i).getCodigoAsignacion() == codigoAsignacion)
                return obtener(i);
        return null;
    }

    public void eliminar(AsignacionDocente x) {
        asi.remove(x);
        grabarAsignaciones();
    }

    public int codigoCorrelativo() {
        if (tamanio() == 0)
            return 5001;
        else
            return obtener(tamanio() - 1).getCodigoAsignacion() + 1;
    }

    public void actualizarArchivo() {
        grabarAsignaciones();
    }

    private void grabarAsignaciones() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("asignacionDocentes.txt"))) {
            for (AsignacionDocente x : asi) {
                String linea = x.getCodigoAsignacion() + ";" +
                                x.getCodigoDocente() + ";" +
                                x.getCodigoCurso() + ";" +
                                x.getEstadoAsignacion();
                pw.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarAsignaciones() {
        try (BufferedReader br = new BufferedReader(new FileReader("asignacionDocentes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] s = linea.split(";");
                int codAsignacion = Integer.parseInt(s[0].trim());
                int codDocente = Integer.parseInt(s[1].trim());
                int codCurso = Integer.parseInt(s[2].trim());
                int estado = Integer.parseInt(s[3].trim());

                AsignacionDocente asignacion = new AsignacionDocente(codAsignacion, codDocente, codCurso, estado);

                if (asignacion != null) {
                    adicionar(asignacion);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
