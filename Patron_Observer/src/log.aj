import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public aspect log {
	Calendar cal = Calendar.getInstance();
	pointcut logReport() :call(* infor*(..));
    after() : logReport(){
    	Object[] signatureArgs = thisJoinPoint.getArgs();
    	Object signatureArg = signatureArgs[0];
    	
    	System.out.println("Arg: " + signatureArg);
    	try {
    		File file = new File("historico.txt");
    		FileWriter fileW;
		
    		fileW =  new FileWriter(file,true);
    		Date fecha = cal.getTime();
    		fileW.write("Se  ha cambiado el color a " + signatureArg + " a las:\n\t-" + fecha.toString() + "\n");
			fileW.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
   }
}
