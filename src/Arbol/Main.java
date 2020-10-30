package Arbol;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. Agregar pacientes a un arbol desde un documento .txt
		Arbol ar = new Arbol();
		ListaSintoma li = new ListaSintoma();
		BufferedReader bf = new BufferedReader(new FileReader("Covid-19-datos.txt"));
		int cantPaciente = Integer.parseInt(bf.readLine());
		String[] arrPaciente;
		String[] Sintoma;
		
		for (int i = 0; i < cantPaciente; i++)
		{
			arrPaciente = bf.readLine().split(", ");
			Paciente paciente = new Paciente(arrPaciente[0], Integer.parseInt(arrPaciente[1]));
			int cantSintomas = Integer.parseInt(arrPaciente[2]);
			//paciente.totalSintomas(cantSintomas);
			for (int j = 0; j < cantSintomas; j++) {
				Sintoma = bf.readLine().split(", ");
				Sintoma sintoma = new Sintoma(Sintoma[0]);
				paciente.agregarSintoma(sintoma);
			}
			ar.añadirPaciente(paciente);
		}
		
		// Mostrar arbol (para comprobar que no los agrego a la lista
		System.out.println("------ Pacientes registrados ------");
		ar.mostrarArbol(ar.root);
		
		// 3. Mostrar sintomas de pacientes
		System.out.println("------  ------");
		int codigoPacienteBuscar = 20;
		Paciente p = ar.buscador(codigoPacienteBuscar);
		System.out.print("Los sintomas del paciente " + p.nombre + " son: \n");
		p.mostrarSintomas(p.listaSintomas);
	}

}
