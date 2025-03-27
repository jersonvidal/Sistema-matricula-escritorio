package gui;

import java.awt.EventQueue;



import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import arreglos.ArregloAlumno;
import arreglos.ArregloCurso;
import arreglos.ArregloMatricula;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import clases.*;

public class ReporteAlumnoNoMatriculado extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnReportar;
	private JScrollPane scrollPane;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReporteAlumnoNoMatriculado dialog = new ReporteAlumnoNoMatriculado();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ReporteAlumnoNoMatriculado() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\\\Users\\\\User\\\\Desktop\\\\AED_Proyecto_Grupo_1\\cibertec.png"));
		
		setTitle("Reporte | Alumnos no matrículados");
		setBounds(100, 100, 450, 350);
		getContentPane().setLayout(null);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(161, 11, 120, 23);
		getContentPane().add(btnReportar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 414, 255);
		getContentPane().add(scrollPane);
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
	}
	
	//	Declaracion global
	ArregloAlumno aa = new ArregloAlumno();
	ArregloCurso ac = new ArregloCurso();
	ArregloMatricula am = new ArregloMatricula();
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnReportar) {
			actionPerformedBtnReportar(e);
		}
	}
	
	protected void actionPerformedBtnReportar(ActionEvent e) {
		txtResultado.setText("");
		listar();
	}
	
	
		void listar() {
		    ArrayList<Alumno> alumnosNoMatriculados = new ArrayList<>();

		    for (int i = 0; i < aa.tamanio(); i++) {
		        Alumno alumno = aa.obtener(i);

		        // Verificar si el alumno no está matriculado
		        if (!estadoMatricula(alumno.getCodigoAlumno())) {
		            alumnosNoMatriculados.add(alumno);
		        }
		    }

		    if (alumnosNoMatriculados.isEmpty()) {
		        imprimir("Todos los alumnos están matriculados.");
		    } else {
		        imprimir("Alumnos no matriculados:");
		        imprimir("------------------------------------------------------");
		        imprimir(String.format("%-15s%-20s%-20s%-15s", "Código", "Nombre", "Apellido", "DNI"));
		        imprimir("------------------------------------------------------");

		        for (Alumno alumno : alumnosNoMatriculados) {
		            imprimir(String.format("%-15s%-20s%-20s%-15s",
		                    alumno.getCodigoAlumno(),
		                    alumno.getNombre(),
		                    alumno.getApellido(),
		                    alumno.getDni()));
		        }
		    }
		}
	
	
	boolean estadoMatricula(int codigoAlumno) {
		for (int i=0; i<am.tamanio(); i++)
			if (am.obtener(i).getCodigoAlumno() == codigoAlumno)
				return true;
		return false;
	}
	
	void imprimir(String s) {
		txtResultado.append(s + "\n");
	}
}
