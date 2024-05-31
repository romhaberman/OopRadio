package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(8);

        int expected = 8;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(10);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(-1);

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationNumber() {
        Radio rad = new Radio();

        rad.maxCurrentStationNumber();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(5);

        rad.nextStationNumber();

        int expected = 6;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMoreMaxStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(9);

        rad.nextStationNumber();

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(7);

        rad.prevStationNumber();

        int expected = 6;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLessMinStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(0);

        rad.prevStationNumber();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(54);

        int expected = 54;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setSoundVolume(101);

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setSoundVolume(-1);

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxSoundVolume() {
        Radio rad = new Radio();

        rad.maxSoundVolume();

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(52);

        rad.moreSound();

        int expected = 53;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(101);

        rad.moreSound();

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(48);

        rad.lessSound();

        int expected = 47;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessMinSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(-1);

        rad.lessSound();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}