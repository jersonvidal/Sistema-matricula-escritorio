package clases;

public class AsignacionDocente {
    private int codigoAsignacion;
    private int codigoDocente;
    private int codigoCurso;
    private int estadoAsignacion;

    public AsignacionDocente(int codigoAsignacion, int codigoDocente, int codigoCurso, int estadoAsignacion) {
        this.codigoAsignacion = codigoAsignacion;
        this.codigoDocente = codigoDocente;
        this.codigoCurso = codigoCurso;
        this.estadoAsignacion = estadoAsignacion;
    }

    public int getCodigoAsignacion() {
        return codigoAsignacion;
    }

    public void setCodigoAsignacion(int codigoAsignacion) {
        this.codigoAsignacion = codigoAsignacion;
    }

    public int getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(int codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getEstadoAsignacion() {
        return estadoAsignacion;
    }

    public void setEstadoAsignacion(int estadoAsignacion) {
        this.estadoAsignacion = estadoAsignacion;
    }

    public String getDescripcionEstado() {
        if (estadoAsignacion == 0) {
            return "No Asignado";
        } else if (estadoAsignacion == 1)
            return "Asignado";
        else
            return "No determinado";
    }
}