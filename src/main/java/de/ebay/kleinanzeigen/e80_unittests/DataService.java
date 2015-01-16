package de.ebay.kleinanzeigen.e80_unittests;

import de.ebay.kleinanzeigen.e80_unittests.support.Animator;
import de.ebay.kleinanzeigen.e80_unittests.support.ApiDataLoader;

public class DataService {

    private final ApiDataLoader dataLoader;

    private volatile Object data;

    DataService(ApiDataLoader apiDataLoader, Animator animator) {
        dataLoader = apiDataLoader;
        data = dataLoader.loadDataFromApi();
        animator.start(()->{
            data = dataLoader.loadDataFromApi();
        });

    }

    public Object getData() {
        return data;
    }
}
