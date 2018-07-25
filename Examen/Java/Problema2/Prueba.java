
public class Prueba {

	public static void main(String[] args) {
		
		Persona[] personas = new Persona[3];
		personas[0] = new Persona();
		personas[1] = new Persona();
		personas[2] = new Persona();
		
		personas[0].setNombres("MANUEL");
		personas[0].setApellidoP("ZARATE");
		personas[0].setAapellidoM("VAZQUEZ");
		personas[0].setFechaNacimiento("23/10/1989");
		personas[0].setCp("32543");
		
		personas[0].setNombres("DIEGO VUSUMZI");
		personas[0].setApellidoP("PACHECO");
		personas[0].setAapellidoM("BELMONT");
		personas[0].setFechaNacimiento("06/07/1991");
		personas[0].setCp("32543");
		
		personas[0].setNombres("LUIS GERARDO");
		personas[0].setApellidoP("VELES");
		personas[0].setAapellidoM("SUARES");
		personas[0].setFechaNacimiento("19/08/1988");
		personas[0].setCp("32543");
		
		for(int i=0; i<personas.length; i++) {
			System.out.println("nombre: "+personas[i].getNombres()+" "+personas[i].getApellidoP()+" "+personas[i].getApellidoM());
			System.out.println("fecha de nacimiento: "+personas[i].getFechaNacimiento());
			System.out.println("cp: "+personas[i].getCp());
			System.out.println("------------------------");
		}

	}

}
