package module8;

public class CountSetbits {
    public static void main(String[] args) {

        int num = 9;
        int count = 0;

        while(num > 0){
            count += num & 1;
            num >>= 1;
        }

        System.out.println("Set Bits = " + count);
    }
}

