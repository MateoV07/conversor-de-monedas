import com.google.gson.Gson;
import netscape.javascript.JSObject;
import org.json.JSONObject;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int valor = 0;
		ConsultarMonedas consultarMonedas = new ConsultarMonedas();
		while (opcion !=7){
			System.out.println("********************************************");
			System.out.println("Sea bienvenido/a al Conversor de Moneda =)");
			System.out.println("1) Dólar =>> Peso argentino");
			System.out.println("2) Peso argentino =>> Dólar");
			System.out.println("3) Dólar =>> Peso colombiano");
			System.out.println("4) Peso colombiano =>> Dólar");
			System.out.println("5) Dólar =>> Peso chileno");
			System.out.println("6) Peso chileno =>> Dólar");
			System.out.println("7) Salir");
			System.out.println("Elija una opción válida");
			opcion = sc.nextInt();
			if (opcion == 7){
				break;
			}else {
				System.out.println("Ingrese el valor que desea convertir:");
				valor = sc.nextInt();
				switch (opcion){
					case 1:
						System.out.println("El valor "+valor+" [USD] corresponde "+
								"al valor final de =>> "+consultarMonedas.consultarMonedas()[0]*valor+" [ARS]");
						break;
					case 2:
						System.out.println("El valor "+valor+" [ARS] corresponde "+
								"al valor final de =>> "+consultarMonedas.consultarMonedas()[0]/valor+" [USD]");
						break;
					case 3:
						System.out.println("El valor "+valor+" [USD] corresponde "+
								"al valor final de =>> "+valor*consultarMonedas.consultarMonedas()[1]+" [COP]");
						break;
					case 4:
						System.out.println("El valor "+valor+" [COP] corresponde "+
								"al valor final de =>> "+valor/consultarMonedas.consultarMonedas()[1]+" [USD]");
						break;
					case 5:
						System.out.println("El valor "+valor+" [USD] corresponde "+
								"al valor final de =>> "+valor*consultarMonedas.consultarMonedas()[2]+" [CLP]");
						break;
					case 6:
						System.out.println("El valor "+valor+" [CLP] corresponde "+
								"al valor final de =>> "+valor/consultarMonedas.consultarMonedas()[2]+" [USD]");
						break;
					default:
						System.out.println("Valor inválido");
				}
			}
			System.out.println("");

		}




	}
}