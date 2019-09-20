package com.stackroute;

public class ClaimManager {

    private Claim claim;

    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public void fileClaim(Claim claim){

        System.out.println("Filing Claim");
        System.out.println("Customer is "+claim.getCustomer().getName()+"\n");

    }

    public void validateClaim(Claim claim){

        System.out.println("Validate Claim");
        System.out.println("Surveyor is "+claim.getSurveyor().getName()+"\n");
    }

    public void finalizeClaim(Claim claim){

        System.out.println("Finalize Claim");
        System.out.println("Manager is "+claim.getManager().getName()+"\n");
    }

}
