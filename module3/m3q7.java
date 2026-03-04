package module3;

public class m3q7 {
    private String secret; // pvt variable

    // Getter
    public String getSecret() {return secret;
    }

    // Setter
    public void setSecret(String s) {
        this.secret = s;
    }

    public static void main(String[] args) {
        m3q7 data = new m3q7();
        data.setSecret("I am spiderman");
        System.out.println("Stored Secret: " + data.getSecret());
    }
}
