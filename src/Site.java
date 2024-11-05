public class Site {


    static final double TAX_RATE = 0.13;

    double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
    double getBaseAmount() {
        return 0; // This will be overridden by subclasses
    }

    double getTaxAmount() {
        return 0; // This will be overridden by subclasses
    }

    public static void main(String[] args) {
        ResidentialSite resSite = new ResidentialSite(10, 10);
        LifelineSite lifeLineSite = new LifelineSite(10, 10);

        System.out.println("Billable amount for residential site is: "+ resSite.getBillableAmount());
        System.out.println("Billable amount for lifeline site is: "+ lifeLineSite.getBillableAmount());
        System.out.println("Same results even after refactoring!");
    }
}

