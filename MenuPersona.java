public class MenuPersona{
  BufferR bf=new BufferR();
  ControladorPersona cPersona=new ControladorPersona();
  String NuevoNombre;
  String NuevoApellido;
  String NuevoSexo;
  int NuevaEdad;
  int opc;
  public void menuPrincipal(){
  System.out.println("----- Menu Principal ----");
  System.out.println("| 1...Personas ingresadas |");
  System.out.println("| 2...Modificar persona   | ");
  System.out.println("| 3...Reporte de persona  |");
  System.out.println("|_________________________|");
 
  opc=bf.ingresarNumero();
  
    switch(opc){
      case 1:
		System.out.println("***MOSTRANDO PERSONAS INGRESADAS***");
		cPersona.personasAgregadas();
        cPersona.ingresarPersona();
      break;
	  
	  case 2:
			System.out.println("Ingrese el nombre a buscar");
			NuevoNombre=bf.ingresarTexto();
			cPersona.personasAgregadas();
			cPersona.modificarPersona(NuevoNombre);
					
			
		
			
			break;
		
	  case 3:
			System.out.println("***MOSTRANDO REPORTE DE PERSONAS***");
			cPersona.personasAgregadas();
			cPersona.reportePersona();
			
      
    }
  }

}