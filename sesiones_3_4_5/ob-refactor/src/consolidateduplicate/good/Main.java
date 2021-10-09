package consolidateduplicate.good;

public class Main {
	
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;
        if(isEligibleExtraSalary()){ // verdadero
            result = 500;
        }else{ // faso
            result = 0;
        }
        sendMessage();
        return result;

    }

    private void sendMessage() {
    	// send email
    	// connect smtp
        System.out.println("Sending message");
    }

    private boolean isEligibleExtraSalary() {
        boolean firstLevel = seniority<1 || education<1;
        boolean secondLevel = incidents > 10 || !certification;

        return  firstLevel || secondLevel;
    }

}
