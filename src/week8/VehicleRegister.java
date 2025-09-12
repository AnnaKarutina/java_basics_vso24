package week8;

import java.util.HashMap;

public class VehicleRegister {
    HashMap<RegistrationPlate, String> owners;

    public  VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if(!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(RegistrationPlate plate) {
        if(!owners.containsKey(plate)) {
            return null;
        } else {
            return owners.get(plate);
        }
    }

    public boolean delete(RegistrationPlate plate){
        if(owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates(){
        for(RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners(){
        for(String owner : owners.values()) {
            System.out.println(owner);
        }
    }
}
