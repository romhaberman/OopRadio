package ru.netology.org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio(30);

    @Test
    public void shouldNextStation() {
        Radio rad = new Radio(30);
        rad.setCurrentStationNumber(26);

        rad.nextStation();

        int expected = 27;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfterMax() {
        rad.setCurrentStationNumber(29);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationDefaultRadio() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(6);

        rad.nextStation();

        int expected = 7;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousStationNumber() {
        rad.setCurrentStationNumber(5);

        rad.prevStation();

        int expected = 4;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousStationBeforeMin() {
        rad.setCurrentStationNumber(0);

        rad.prevStation();

        int expected = 29;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationAboveMax() {
        rad.setCurrentStationNumber(31);

        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationBelowMin() {
        rad.setCurrentStationNumber(-2);

        rad.prevStation();

        int expected = 29;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSpecificallyStation() {
        rad.setCurrentStationNumber(3);

        int expected = 3;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        rad.setsoundVolume(8);

        rad.increaseVolume();

        int expected = 9;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        rad.setsoundVolume(8);

        rad.decreaseVolume();

        int expected = 7;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        rad.setsoundVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        rad.setsoundVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        rad.setsoundVolume(102);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        rad.setsoundVolume(-3);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}