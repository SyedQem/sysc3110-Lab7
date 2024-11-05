public class ResidentialSite extends Site {

    private double _units;
    private double _rate;

    ResidentialSite(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    @Override
    double getBaseAmount() {
        return _units * _rate;
    }

    @Override
    double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

}
