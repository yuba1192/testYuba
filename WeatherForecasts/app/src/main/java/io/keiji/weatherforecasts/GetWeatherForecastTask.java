package io.keiji.weatherforecasts;

import android.os.AsyncTask;

import org.json.JSONException;

import java.io.IOException;

/**
 * Created by yuba on 2017/06/24.
 */

public class GetWeatherForecastTask extends AsyncTask<String, Void, WeatherForecast>{
    Exception exception;

    @Override
    public WeatherForecast doInBackground(String... params) {
        try {
            return WeatherApi.gerWeather(params[0]);
        } catch (IOException | JSONException e) {
            exception = e;
        }
        return null;
    }
}
