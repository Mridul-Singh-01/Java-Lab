import java.util.Scanner;
class TrunkCall {
    int duration;
    TrunkCall(int d) {
        duration = d;
    }
    void calculateCharges() {
        System.out.println("Charges: " + duration * 2);
    }
}
class UrgentTrunkCall extends TrunkCall {
    UrgentTrunkCall(int d) {
        super(d);
    }
    void calculateCharges() {
        System.out.println("Charges: " + duration * 3);
    }
}
class LightningTrunkCall extends TrunkCall {
    LightningTrunkCall(int d) {
        super(d);
    }
    void calculateCharges() {
        System.out.println("Charges: " + duration * 4);
    }
}
public class Exp3_Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter duration: ");
        int duration = sc.nextInt();
        System.out.print("Enter type of call (1 for ordinary, 2 for urgent, 3 for lightning): ");
        int type = sc.nextInt();
        TrunkCall call;
        switch (type) {
            case 1:
                call = new TrunkCall(duration);
                break;
            case 2:
                call = new UrgentTrunkCall(duration);
                break;
            case 3:
                call = new LightningTrunkCall(duration);
                break;
            default:
                System.out.println("Invalid type of call.");
                return;
        }
        call.calculateCharges();
        sc.close();
    }
}
