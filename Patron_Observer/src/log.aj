
public aspect log {
	pointcut logReport() :call(* infor*(..));
    after() : logReport(){
    	Object[] signatureArgs = thisJoinPoint.getArgs();
    	   for (Object signatureArg: signatureArgs) {
    	      System.out.println("Arg: " + signatureArg);
    	      //Crear un metodo que sobreescriba un archivo txt y le pase el parametro del argumento
    	      //signatureArgs es el parametro
    	   }
    }
}
