

// note: used enum for FanSpeeds to force user use the pre-defined speeds
// for speed. int type also could be used for speed and increase the int value by 1 for
// increasing speed (simpler solution).


public class Main {

    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan(true,FanSpeeds.SPEED2);
        System.out.println("Current ceiling fan status:");
        System.out.println("speed:  " + ceilingFan.getSpeed());
        System.out.println("is clockwise:  " + ceilingFan.isClockwise());
        ceilingFan.reverseDirection();
        ceilingFan.increaseSpeed();
        System.out.println("Changed ceiling fan status:");
        System.out.println("speed:  " + ceilingFan.getSpeed());
        System.out.println("is clockwise:  " + ceilingFan.isClockwise());
        ceilingFan.reverseDirection();
        ceilingFan.increaseSpeed();
        System.out.println("Changed ceiling fan status:");
        System.out.println("speed:  " + ceilingFan.getSpeed());
        System.out.println("is clockwise:  " + ceilingFan.isClockwise());
    }
}


