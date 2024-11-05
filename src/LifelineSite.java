public class LifelineSite extends Site {

    private double _units;
    private double _rate;

    LifelineSite(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    @Override
    double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    @Override
    double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

}
