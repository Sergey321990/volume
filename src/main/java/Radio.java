class Radio {
    private int currentStation;
    private final int maxStation;
    Radio() {
        this.maxStation = 9;

    }

    Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        } else {
            currentStation = 0;
        }
    }

    void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        } else {
            currentStation = maxStation;
        }
    }

    int getCurrentStation() {
        return currentStation;
    }

    void
    Radio(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }
}



















































