package Arbol;

public class Arbol {
	
	Nodo root;
	
	public void añadirPaciente (Paciente nuevoPaciente)
	{
		if (root == null) 
		{
			root = new Nodo(nuevoPaciente);
			return;
		}
		
		if (encontrarRepetido(nuevoPaciente)) 
		{
			System.out.println("Un usuario con el codigo " + nuevoPaciente.codigo + " ya esta registrado"
					+ "\n El usuario " + nuevoPaciente.nombre + " no fue añadido");
		}else {
			añadirPaciente(root, nuevoPaciente);
		}
	}
	
	private void añadirPaciente (Nodo root, Paciente nuevoPaciente)
	{
		if (root == null) 
		{
			return;
		}
		
		if (nuevoPaciente.codigo > root.paciente.codigo) 
		{
			if (root.derecha == null) 
			{
				root.derecha = new Nodo(nuevoPaciente);
			}else
			{
				añadirPaciente(root.derecha, nuevoPaciente);
			}
		}else
		{
			if (root.izquierda == null) 
			{
				root.izquierda = new Nodo(nuevoPaciente);
			}else
			{
				añadirPaciente(root.izquierda, nuevoPaciente);
			}
		
		}
	}
	
	public Paciente buscador(int codigo) 
    {
        return buscador(root, codigo);
    }

    private Paciente buscador(Nodo node, int codigo) 
    {

        if(node == null) {
            return null;
        }

        if(node.paciente.codigo == codigo){
            return node.paciente;
        }

        if(node.paciente.codigo < codigo) {
            return buscador(node.derecha, codigo);
        }

        return buscador(node.izquierda, codigo);
    }
    
    public boolean encontrarRepetido (Paciente p)
    {
    	Paciente encontrado = buscador(p.codigo);
    	if (encontrado != null) {
			return true;
		}
    	return false;
	}
    
    public void mostrarArbol (Nodo root) {
		
    	System.out.println(root.paciente.nombre);
    	
    	if (root.izquierda != null) {
			mostrarArbol(root.izquierda);
		}
    	if (root.derecha != null) {
			mostrarArbol(root.derecha);
		}
	}
}
