package service;

public class CalculatriceWS {

	 @webService(name="CalculatriceWS")
	@WebMethod(operationName="Somme")
	double Somme (@WebParam(name="a") int a, @WebParam(name="b") int b)
	{
		double res ;

		res=a+b;
		return res;
	
	}

	
	
	
	
}
