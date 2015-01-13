package de.ebay.kleinanzeigen.e80_unittests;

import de.ebay.kleinanzeigen.e80_unittests.support.ApiDataLoader;

import java.util.Timer;
import java.util.TimerTask;

public class DataService {

    private final ApiDataLoader dataLoader = new ApiDataLoader();

    private volatile Object data;


    DataService() {
        data = dataLoader.loadDataFromApi();
        new Timer("timer", true).schedule(new TimerTask() {
            @Override
            public void run() {
                data = dataLoader.loadDataFromApi();
            }
        }, 3600, 3600);
    }

    public Object getData() {
        return data;
    }
}
