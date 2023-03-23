package abstractdemo;

public abstract class Branch {
    abstract protected boolean validatePhotoProof(String proof);

    abstract public boolean validateAddressProof(String proof);

    public void openAccount(String photoProof, String addressProof, int amount) {
        if (amount >= 1000) {
            if (validateAddressProof(addressProof) && validatePhotoProof(photoProof)) {
                System.out.println("Account opened");
            } else {
                System.out.println("cannot open account");
            }
        } else {
            System.out.println("cannot opened account");
        }
    }
}
