package Arbol;

public class Paciente {
	
	String nombre;
	int codigo;
	ListaSintoma listaSintomas;
	
	public Paciente(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		
		listaSintomas = new ListaSintoma();
	}
	
	public void agregarSintoma (Sintoma sintoma) 
	{		
		listaSintomas.insertar(sintoma);
	}
	
	public void mostrarSintomas(ListaSintoma l) 
	{
		NodoLista tmp = l.head;
		while(tmp != null)
		{
			System.out.println(tmp.sintoma.nombre);
			tmp = tmp.next;
		}
	}
	
	
	
	
}
