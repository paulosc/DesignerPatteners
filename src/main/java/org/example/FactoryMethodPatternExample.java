package org.example;

import java.util.HashMap;
import java.util.Map;

// Class to represent CEP information
class CEPInfo {
    private String street;
    private String city;
    private String state;

    public CEPInfo(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

// Factory to fetch CEP information
class CEPInfoFactory {
    private static Map<String, CEPInfo> cepInfoDatabase = new HashMap<>();

    static {
        // Populate the database with sample CEP information
        cepInfoDatabase.put("12345-678", new CEPInfo("123 Main St", "Sample City", "CA"));
        cepInfoDatabase.put("98765-432", new CEPInfo("456 Elm St", "Another City", "NY"));
        // Add more CEP entries as needed
    }

    public static CEPInfo getCEPInfo(String cep) {
        // Check if the CEP information is available in the database
        CEPInfo info = cepInfoDatabase.get(cep);
        if (info != null) {
            return info;
        } else {
            return null; // CEP information not found
        }
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        String inputCEP = "12345-678"; // Replace with the CEP you want to look up
        CEPInfo cepInfo = CEPInfoFactory.getCEPInfo(inputCEP);

        if (cepInfo != null) {
            System.out.println("CEP: " + inputCEP);
            System.out.println("Street: " + cepInfo.getStreet());
            System.out.println("City: " + cepInfo.getCity());
            System.out.println("State: " + cepInfo.getState());
        } else {
            System.out.println("CEP information not found for " + inputCEP);
        }
    }
}
