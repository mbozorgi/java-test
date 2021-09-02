public class CeilingFan {
    private boolean clockwise;
    private FanSpeeds speed;

    public CeilingFan(boolean clockwise, FanSpeeds speed) {
        this.clockwise = clockwise;
        this.speed = speed;
    }

    public boolean isClockwise() {
        return clockwise;
    }

    public void setClockwise(boolean clockwise) {
        this.clockwise = clockwise;
    }

    public FanSpeeds getSpeed() {
        return speed;
    }

    public void setSpeed(FanSpeeds speed) {
        this.speed = speed;
    }

    public void increaseSpeed() {
        FanSpeeds currentSpeed = this.getSpeed();
        if (currentSpeed.equals(FanSpeeds.SPEED0)) this.setSpeed(FanSpeeds.SPEED1);
        if (currentSpeed.equals(FanSpeeds.SPEED1)) this.setSpeed(FanSpeeds.SPEED2);
        if (currentSpeed.equals(FanSpeeds.SPEED2)) this.setSpeed(FanSpeeds.SPEED3);
        if (currentSpeed.equals(FanSpeeds.SPEED3)) this.setSpeed(FanSpeeds.SPEED0);
    }

    public void reverseDirection() {
        this.setClockwise(!this.isClockwise());
    }
}
