package zipcode;

public class Hamming {
    private String string1;
    private String string2;

    public Hamming(String s, String s1) {
        this.string1 = s;
        this.string2 = s1;

        if (string1.length() != string2.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int counter = 0;
        for (int i = 0; i < string1.length(); i++){
                if (string1.charAt(i) != string2.charAt(i)){
                    counter++;
            }
        }
        return counter;
    }
}
