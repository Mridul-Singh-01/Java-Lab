package Exp_6;

class vehicle {
    public int direction;

    public vehicle(int direction) {
        this.direction = direction;
    }
}

public class Exp6_Program4 {
    public static boolean checkCollision(vehicle x, vehicle y) {
        if (x.direction != y.direction) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws CollisionException {
        vehicle x = new vehicle(1);
        vehicle y = new vehicle(0);
        if (checkCollision(x, y)) {
            System.out.println("track is good");
        } else {
            throw new CollisionException("Collision is approaching");
        }
    }
}

class CollisionException extends Exception {
    public CollisionException(String msg) {
        System.out.println(msg);
    }
}
