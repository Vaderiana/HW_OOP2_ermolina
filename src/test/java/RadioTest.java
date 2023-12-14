import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //Требования к работе с радиостанциями
    @Test
    public void shouldSetMaxToRadioStation() {
        Radio radio = new Radio();

        radio.turnOnToMaxRadioStationNumber();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetNextRadioStationSince9() {
        Radio radio = new Radio();

        radio.turnOnToMaxRadioStationNumber();
        radio.nextStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationSince7() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(7);

        int expected = 7;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationMinus1() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetNextRadioStationSince0() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    public void ShouldSetNextRadioStationSince1() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetPrevRadioStationSince1() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetPrevRadioStationSince0() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetPrevRadioStationSince9() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NewNumberRadioStationSince0() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NewNumberRadioStationSince9() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NewNumberRadioStationSince10() {
        Radio radio = new Radio();

        radio.turnOnRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //Требования к работе с уровнем громкости звука
    @Test
    public void increaseVolumeSince100() {
        Radio radio = new Radio();

        radio.turnOnCurrentVolume(100);
        radio.addVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeSince99() {
        Radio radio = new Radio();

        radio.turnOnCurrentVolume(99);
        radio.addVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeSince0() {
        Radio radio = new Radio();

        radio.turnOnCurrentVolume(0);
        radio.addVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void downVolumeSince100() {
        Radio radio = new Radio();

        radio.turnOnCurrentVolume(100);
        radio.turndownVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void downVolumeSince0() {
        Radio radio = new Radio();

        radio.turnOnCurrentVolume(0);
        radio.turndownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void newCurrentVolumeMinus1() {
        Radio radio = new Radio();

        radio.turnOnCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void newCurrentVolumeSince101() {
        Radio radio = new Radio();

        radio.turnOnCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}