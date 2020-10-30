package Arbol;

public class ListaSintoma {

	NodoLista head;
	
	void insertar(Sintoma s)
	{
		NodoLista nuevoNodo = new NodoLista();
		nuevoNodo.sintoma = s;
		
		
		if(head == null) //La lista está vacía
		{
			head = nuevoNodo;
		}
		else//La lista no está vacía 
		{ 
			NodoLista ultimo = head;
			
			while(ultimo.next != null) 
			{
				ultimo = ultimo.next;			
			}
			ultimo.next = nuevoNodo;
		}
	}
	
}
