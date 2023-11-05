package service;
import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;
public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8084/";
        CalculatriceWS service = null;
		try {
			service = CalculatriceWS.class.newInstance();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}


        Endpoint.publish(url, service);

      
        System.out.println("Url de service" + url);
    }
}
 