public class Complement {

    String binary;

    public Complement(String binary){

        if(binary == null){
            throw new NullPointerException("Null binary string");
        }
        else {
            if (binary.matches(".*[^10]+.*") || binary.length() == 0) {
                throw new IllegalArgumentException("Not a valid binary number");
            }
            else {
                this.binary = binary;
            }
        }
    }

    public String getBinary(){
        return this.binary;
    }

    public String onesComplement(){
        String onesComplement = "";
        int index = 0;

        while (index < this.binary.length()){
            if (this.binary.charAt(index) == '0'){
                onesComplement += "1";
            }
            else {
                onesComplement += "0";
            }
            index++;
        }
        return onesComplement;
    }
}