package Usunac;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;

public class C {
    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();

        Client klient = Client.create();
        String u;
        WebResource webResource =
                klient.resource("http://api.nbp.pl/api/exchangerates/rates/a/usd");

        System.out.println(webResource);
        ClientResponse webOdpowiedz  = webResource.accept("application/json").get(ClientResponse.class);
        String pobranyJson = webOdpowiedz.getEntity(String.class);
        System.out.println(pobranyJson);

    }
}
