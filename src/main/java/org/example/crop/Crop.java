package org.example.crop;

import org.example.interfaces.Produce;

public abstract class Crop implements Produce {
        private boolean hasBeenHarvested = false;

        private boolean hasBeenFerilized = false;

        public Crop(){

        }

        public Crop(boolean hasBeenHarvested, boolean hasBeenFerilized){
            this.hasBeenHarvested = hasBeenHarvested;
            this.hasBeenFerilized = hasBeenFerilized;

        }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean isHasBeenFerilized() {
        return hasBeenFerilized;
    }

    public void setHasBeenFerilized(boolean hasBeenFerilized) {
        this.hasBeenFerilized = hasBeenFerilized;
    }
}
