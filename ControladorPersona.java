public class ControladorPersona{
	BufferR bf=new BufferR();
	Persona[] persona=new Persona[5];
	public void personasAgregadas(){
		persona[0]=new Persona("Juan","Hernandez",12,"M");
		persona[1]=new Persona("Roberto","Mendoza",25,"M");
		persona[2]=new Persona("Juancho","Perez",45,"M");
		persona[3]=new Persona("Maria","Bolivar",30,"F");
		persona[4]=new Persona("Mercedes","Lopez",21,"M");
	}
	public void ingresarPersona(){
		
		for(Persona i:persona){
			System.out.println(i.retornarNombre()+" "+i.retornarApellido());
		}
	}
	public void modificarPersona(String nombreBuscar){
		int contador=0;
		int falso=0;
		String NuevoNombre;
		String NuevoApellido;
		String NuevoSexo;
		int NuevaEdad;
		
		for(Persona i:persona){
			if(nombreBuscar.equals(i.retornarNombre())){
				
				System.out.println("El usuario si existe");
				System.out.println("Ingrese el nuevo nombre:");
				NuevoNombre=bf.ingresarTexto();
				System.out.println("Ingrese el nuevo apellido: ");
				NuevoApellido=bf.ingresarTexto();
				System.out.println("Ingrese la nueva edad: ");
				NuevaEdad=bf.ingresarNumero();
				System.out.println("Ingrese el Nuevo sexo");
				NuevoSexo=bf.ingresarTexto();
				System.out.println("La persona modificada es la sigueinte: "+NuevoNombre+" "+NuevoApellido+" "+NuevaEdad+" "+NuevoSexo);
				System.out.println("----------------------------------------------------------------");
				System.out.println("La persona antes de ser modificada era asi: "+i.retornarNombre()+" "+i.retornarApellido()+" "+i.retornarEdad()+" "+i.retornarSexo());
			
				break;
			}else{
				falso++;
			}
			
		}
		if(falso==5){
			System.out.println("El usuario no existe");
		}
		
		
	}
	
	public void reportePersona(){;

		for(Persona i:persona){
			System.out.println(i.retornarNombre()+" "+i.retornarApellido()+" "+i.retornarEdad()+" "+i.retornarSexo());
		}
	}	
}