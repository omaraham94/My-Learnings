package InnerClassImplementation;

public class Main {
    public static void main(String[] args) {
        GearBox mClaren = new GearBox(6);
        GearBox.Gear first= mClaren.new Gear(1,12.0);
        System.out.println(first.driveSpeed(1000));
    }
}
