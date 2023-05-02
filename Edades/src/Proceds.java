import javax.swing.JOptionPane;

public class Proceds {
	String nombres[];
	public void procedimiento() {
		String menu = "Estas son las diferentes opciones que tiene \n";
		menu+="1. Llenar estudiantes \n";
		menu+="2. Mostrar estudiantes \n";
		menu+="3. Buscar nombre \n";
		menu+="4. Salir \n";
		menu+="seleccione alguna opcion";
		int select = Integer.parseInt(JOptionPane.showInputDialog(menu));
		do {
			switch (select) {
			case 1:
				Llenar();
				break;
			case 2:
				Mostrar(nombres);
				break;
				
			case 3:
					
				break;
					
			case 4:
						
				break;
			default:
				break;
			}
			
			
			
			
		} while (select!=4);
		
		
	}
	
	public void Llenar () {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog(
				"ingresa la cantidad de estudiantes"
				));
		nombres = new String[cantidad];
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = JOptionPane.showInputDialog(
					"ingrese el nombre del estudiante numero "+i
					);
		}
	}
	
	public void Mostrar (String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
	
	public void Buscar () {
		
	}
		
	
}

