
public class Pruebas {
	
	//private static Respuesta respuesta = new Respuesta();

	public static void main(String[] args) {
		
		String[] testInputs = new String[10];
		String[] testOutputs = new String[10];
		
		testInputs[0] = "08:34:23AM";
		testInputs[1] = "08:34:23PM";
		testInputs[2] = "12:00:00AM";
		testInputs[3] = "12:00:00PM";
		testInputs[4] = "03:50:12PM";
		testInputs[5] = "01:21:89PM";
		testInputs[6] = "02:54:00AM";
		testInputs[7] = "08:34:23AM";
		testInputs[8] = "05:12:00PM";
		testInputs[9] = "10:20:23PM";
		
		testOutputs[0] = "08:34:23";
		testOutputs[1] = "20:34:23";
		testOutputs[2] = "00:00:00";
		testOutputs[3] = "12:00:00";
		testOutputs[4] = "15:50:12";
		testOutputs[5] = "13:21:89";
		testOutputs[6] = "02:54:00";
		testOutputs[7] = "08:34:23";
		testOutputs[8] = "17:12:00";
		testOutputs[9] = "22:20:23";
		
		//generateOutput(testInputs);
		
		int count = 0;
		for(int i = 0; i<testInputs.length; i++) {
			String hour24 = Respuesta.timeConversion( testInputs[i] );
			String errColor = (char)27 + "[31m";
			if(hour24.equals(testOutputs[i])) {
				errColor = (char)27 + "[32m";
				count++;
			}
			System.out.println(errColor + "Estado :" + (hour24.equals(testOutputs[i])?  "OK": "ERROR" ));
			System.out.println(errColor +"Entrada "+i+": "+testInputs[i]);
			System.out.println(errColor +"Salida "+i+": "+ hour24 );
			System.out.println(errColor +"Salida esperada: "+ testOutputs[i]);
			System.out.println(errColor +"----------------------------------");
			System.out.println("");
		}
		
		System.out.println((char)27 + "[34m"+count+"/"+testInputs.length+" pruebas correctas" );

	}
	
	public static void generateOutput(String[] testInputs) {
		for(int i = 0; i<testInputs.length; i++) {
			System.out.println("testOutputs["+i+"] = \""+ Respuesta.timeConversion( testInputs[i] ) +"\";");
		}
	}

}
