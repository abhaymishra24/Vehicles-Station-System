

  
  
  import java.util.Arrays;

public class Bikelock {
    private static final int COMBINATION_LENGTH = 4;
    private static final int MASTER_CODE = 1234;

    private int[] combination;
    private boolean locked;
    private LockType lockType;

    public enum LockType {
        COMBINATION, RFID, FINGERPRINT
    }

    public Bikelock(LockType lockType) {
        this.lockType = lockType;
        if (lockType == LockType.COMBINATION) {
            combination = new int[COMBINATION_LENGTH];
        }
        locked = true;
    }

    public void lock() {
        locked = true;
        System.out.println("Bike is locked.");
    }

    public boolean unlock(int[] code) {
        if (lockType == LockType.COMBINATION) {
            if (Arrays.equals(code, combination)) {
                locked = false;
                System.out.println("Bike is unlocked.");
                return true;
            } else {
                System.out.println("Incorrect combination.");
                return false;
            }
        } else if (lockType == LockType.RFID) {
            // RFID unlock logic
        } else if (lockType == LockType.FINGERPRINT) {
            // Fingerprint unlock logic
        }
        return false;
    }

    public void setCombination(int[] code) {
        if (lockType == LockType.COMBINATION) {
            combination = code;
            System.out.println("Combination set.");
        } else {
            System.out.println("This lock type does not support combination.");
        }
    }

    public boolean isLocked() {
        return locked;
    }

    public void masterUnlock(int code) {
        if (code == MASTER_CODE) {
            locked = false;
            System.out.println("Bike is unlocked using master code.");
        } else {
            System.out.println("Incorrect master code.");
        }
    }
}