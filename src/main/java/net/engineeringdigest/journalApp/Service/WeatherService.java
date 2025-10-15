package net.engineeringdigest.journalApp.Service;

import lombok.extern.slf4j.Slf4j;
import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class WeatherService {

    public static final String apiKey ="8a6084a114e0590767adb78095026364";
    public static final String API = "http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWeather(String city){
        String finalApi = API.replace("CITY", city).replace("API_KEY", apiKey);
        log.info("final Api : " + finalApi);

        ResponseEntity<WeatherResponse> response =  restTemplate.exchange(finalApi, HttpMethod.GET, null, WeatherResponse.class);
        log.info(String.valueOf(response.getStatusCode()));
        WeatherResponse body = response.getBody();
        return body;
    }
}
