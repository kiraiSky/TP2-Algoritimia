package com.TP2;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GenderDetector {

    // Método para determinar o gênero de um nome usando a API Gender-API
    public static String detectGender(String name, String apiKey) {
        try {
            // Construir a URL para a solicitação GET com o nome, país e chave da API
            String urlString = "https://gender-api.com/get?name=" + name + "&country=PT&key=" + apiKey;
            URL url = new URL(urlString);

            // Abrir conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Ler a resposta da API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Analisar a resposta JSON utilizando o Gson
            JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
            String gender = jsonObject.get("gender").getAsString();

            if (gender.equals("female")) {
                return "Feminino";
            }else if (gender.equals("male")) {
                return "Masculino";
            }else{
                return "Neutro";
            }

        } catch (IOException e) {
            e.printStackTrace();
            return "Desconhecido";
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso da função detectGender com a chave da API Gender-API
        String apiKey = "6017bf6215ceae836691a9f4ce738302df5e3ba001d0196f2d03e75f46633ea2";
        System.out.println("Andrea é: " + detectGender("Andrea", apiKey));
    }
}
