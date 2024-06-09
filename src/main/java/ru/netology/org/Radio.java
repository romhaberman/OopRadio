package ru.netology.org;

public class Radio {
    private int currentStationNumber;
    private int soundVolume;
    private final int NUMBER_STATION = 10;
    private final int MIN_STATION = 0;
    private int maxStation = NUMBER_STATION - 1;
    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 100;

    public Radio(int numberStation) { // конструктор для задания числа радиостанций
        maxStation = numberStation - 1;
    }

    public Radio() { // конструктор для задания числа радиостанций по умолчанию
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) { // указываем границы диапазона
        if (newCurrentStationNumber < MIN_STATION) {
            return;
        }
        if (newCurrentStationNumber > maxStation) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void nextStation() {
        if (currentStationNumber < maxStation) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            currentStationNumber = MIN_STATION; // переход счетчика после 9 на 0
        }
    }

    public void prevStation() {
        if (currentStationNumber > MIN_STATION) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = maxStation; // переход счетчика после 0 на 9
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setsoundVolume(int newSoundVolume) { // указываем границы диапазона
        if (newSoundVolume < MIN_VOLUME) {
            return;
        }
        if (newSoundVolume > MAX_VOLUME) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < MAX_VOLUME) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = MAX_VOLUME;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > MIN_VOLUME) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = MIN_VOLUME;
        }
    }
}