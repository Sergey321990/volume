import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeTest {

    @Test
    public void max() {
        Volume volume = new Volume();
        volume.CurrentVolume();
        Volume.max();
        int actual = Volume.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void min() {
        Volume volume = new Volume();
        volume.CurrentVolume();
        Volume.min();
        int actual = Volume.getCurrentStation();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }
}