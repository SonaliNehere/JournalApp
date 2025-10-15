package net.engineeringdigest.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class WeatherResponse {
    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Current current;

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "current=" + current +
                '}';
    }

    public class Current{
        @Override
        public String toString() {
            return "Current{" +
                    "temperature=" + temperature +
                    ", weather_descriptions=" + weather_descriptions +
                    ", feelslike=" + feelslike +
                    '}';
        }

        private int temperature;

        @JsonProperty("weather_descriptions")
        private ArrayList<String> weather_descriptions;

        private int feelslike;

        public int getFeelslike() {
            return feelslike;
        }

        public void setFeelslike(int feelslike) {
            this.feelslike = feelslike;
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public ArrayList<String> getWeather_descriptions() {
            return weather_descriptions;
        }

        public void setWeather_descriptions(ArrayList<String> weather_descriptions) {
            this.weather_descriptions = weather_descriptions;
        }
    }
}





