package week8;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString(){
        return country+ " " + regCode;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        RegistrationPlate compared = (RegistrationPlate) object;
        if (this.country != compared.country) {
            return false;
        }
        if (this.regCode == null || !this.regCode.equals(compared.regCode)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.country.hashCode() + this.regCode.hashCode();
    }
}
