package Arbol;

public class ListaSintoma {

	NodoLista head;
	
	void insertar(Sintoma s)
	{
		NodoLista nuevoNodo = new NodoLista();
		nuevoNodo.sintoma = s;
		
		
		if(head == null) //La lista est� vac�a
		{
			head = nuevoNodo;
		}
		else//La lista no est� vac�a 
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
