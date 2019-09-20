package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer =new Customer();
        customer.setName("Rahul");
        Manager manager=new Manager();
        manager.setName("Vinay");
        Surveyor surveyor=new Surveyor();
        surveyor.setName("Ajay");

        Claim claim=new Claim();
        claim.setCustomer(customer);
        claim.setManager(manager);
        claim.setSurveyor(surveyor);

        ClaimManager claimManager=new ClaimManager();
        claimManager.fileClaim(claim);
        claimManager.validateClaim(claim);
        claimManager.finalizeClaim(claim);
    }
}
