package de.ebay.kleinanzeigen.e80_unittests.support;

import java.util.Timer;
import java.util.TimerTask;

class FixedIntervalAnimator implements Animator {
    private final long interval, offset;

    public FixedIntervalAnimator(long offset, long interval) {
        this.offset = offset;
        this.interval = interval;
    }

    @Override
    public void start(final Runnable r) {
        new Timer("hermes-package-size-refresher", true).scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                r.run();
            }
        }, offset, interval);

    }
}
