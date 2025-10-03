import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger dec1 = new BigInteger(a, 2); // binary to decimal
        BigInteger dec2 = new BigInteger(b, 2);

        BigInteger sum = dec1.add(dec2); // add the two

        return sum.toString(2); // convert back to binary

}
}