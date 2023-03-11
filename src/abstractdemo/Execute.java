package abstractdemo;

class MumbaiBranch extends Branch {
    public boolean validatePhotoProof(String proof) {
        if (proof.equalsIgnoreCase("pan card")) {
            return true;
        } else
            return false;

    }

    public boolean validateAddressProof(String proof) {
        if (proof.equalsIgnoreCase("ration card")) {
            return true;
        } else
            return false;
    }
}

public class Execute {
    public static void main(String[] args) {
        Branch mumbaiBranch = new MumbaiBranch();
        mumbaiBranch.openAccount("pan card", "ration card", 1000);
    }
}
