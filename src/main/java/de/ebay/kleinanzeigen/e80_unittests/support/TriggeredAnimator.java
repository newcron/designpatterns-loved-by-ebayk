package de.ebay.kleinanzeigen.e80_unittests.support;

public class TriggeredAnimator implements Animator {

        private Runnable r;

        @Override
        public void start(Runnable r) {
            this.r = r;
        }

        public void triggger() {
            r.run();
        }
    }