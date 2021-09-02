import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeilingFanTest {
    @Test
    @DisplayName("Increase fan speed")
    public void shouldIncreaseSpeed() {
        CeilingFan ceilingFan = new CeilingFan(true, FanSpeeds.SPEED2);
        ceilingFan.increaseSpeed();
        assertEquals(ceilingFan.getSpeed(), FanSpeeds.SPEED3);
    }

    @Test
    @DisplayName("reverse fan direction")
    public void shouldReverseDirection() {
        CeilingFan ceilingFan = new CeilingFan(true, FanSpeeds.SPEED1);
        ceilingFan.reverseDirection();
        assertEquals(ceilingFan.isClockwise(), false);
    }

    @Test
    @DisplayName("reverse fan direction no speed change")
    public void shouldReverseDirectionNoSpeedChange() {
        CeilingFan ceilingFan = new CeilingFan(false, FanSpeeds.SPEED2);
        ceilingFan.reverseDirection();
        assertEquals(ceilingFan.isClockwise(), true);
        assertEquals(ceilingFan.getSpeed(), FanSpeeds.SPEED2);
    }

    @Test
    @DisplayName("Increase fan speed : back to SPEED0 if it is on SPEED3")
    public void shouldBackstopSpeed0() {
        CeilingFan ceilingFan = new CeilingFan(true, FanSpeeds.SPEED3);
        ceilingFan.increaseSpeed();
        assertEquals(ceilingFan.getSpeed(), FanSpeeds.SPEED0);
    }

    @Test
    @DisplayName("Increase fan speed : no direction change")
    public void shouldIncreaseSpeedNoDirectionChange() {
        CeilingFan ceilingFan = new CeilingFan(true, FanSpeeds.SPEED1);
        ceilingFan.increaseSpeed();
        assertEquals(ceilingFan.getSpeed(), FanSpeeds.SPEED2);
        assertEquals(ceilingFan.isClockwise(), true);
    }
}