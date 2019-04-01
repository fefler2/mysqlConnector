package Jersey;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.util.zip.CRC32;

public class Waluty {
    public static void main(String[] args) {
        try {
            Client klient = Client.create();
            WebResource webZrodlo =
                    klient.resource
                            ("http://api.nbp.pl/api/exchangerates/rates/c/usd/today/");
            ClientResponse webOdpowiedz = webZrodlo.accept("application/json")
                    .get(ClientResponse.class);

            if (webOdpowiedz.getStatus() != 200) {
                throw new RuntimeException("Blad HTTP ...." + webOdpowiedz.getStatus());
            }
            String pobranyJson = webOdpowiedz.getEntity(String.class);
            System.out.println(pobranyJson);

            // Uzycie Jacksona 2

            ObjectMapper mapper = new ObjectMapper();
            Kursy kurs = mapper.readValue(pobranyJson, Kursy.class);
            System.out.println("kurs +  " +kurs);
            System.out.println();
            System.out.println(kurs.getCurrency());
            System.out.println(kurs.getTable());
            System.out.println(kurs.getCode());

        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
}
