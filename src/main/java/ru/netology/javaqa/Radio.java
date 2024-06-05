package ru.netology.javaqa;

public class Radio {

    private int currentStationNumber;
    private int soundVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > 9) {
            return;
        }
        if (newCurrentStationNumber < 0) {
            newCurrentStationNumber = 9;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 100) {
            newSoundVolume = 100;
        }
        if (newSoundVolume < 0) {
            newSoundVolume = 0;
        }
        soundVolume = newSoundVolume;
    }

    public void maxCurrentStationNumber() {
        currentStationNumber = 9;
    }

    public void nextStationNumber() {
        if (currentStationNumber >= 9) {
            currentStationNumber = 0;
            return;
        }
        currentStationNumber = currentStationNumber + 1;
    }

    public void prevStationNumber() {
        if (currentStationNumber <= 0) {
            currentStationNumber = 9;
            return;
        }
        currentStationNumber = currentStationNumber - 1;
    }

    public void maxSoundVolume() {
        soundVolume = 100;
    }

    public void moreSound() {
        if (soundVolume >= 100) {
            soundVolume = soundVolume;
        }
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void lessSound() {
        if (soundVolume <= 0) {
            soundVolume = soundVolume;
        }
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

}