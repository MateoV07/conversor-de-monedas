import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ConsultarMonedas {

	public Float[] consultarMonedas() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://v6.exchangerate-api.com/v6/3e179bb7187bfc192b839710/latest/USD"))
				.build();
		HttpResponse<String> response = client
				.send(request,HttpResponse.BodyHandlers.ofString());
		String json = response.body();
		JSONObject jsonObject = new JSONObject(json);
		JSONObject rates = jsonObject.getJSONObject("conversion_rates");

		Float ars = rates.getFloat("ARS");
		Float cop = rates.getFloat("COP");
		Float clp = rates.getFloat("CLP");

		Float[] valoresEnUsd ={ars,cop,clp};

		return valoresEnUsd;
	}
}
