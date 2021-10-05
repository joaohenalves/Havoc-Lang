public class DoubleVar extends Variables {

    private Double value;

    public DoubleVar(Double value, String identifier) {
        this.value = value;
        setIdentifier(identifier);
    }

    @Override
    public String getValue() {
        return Double.toString(this.value);
    }

    @Override
    public void setValue(String value) {
        this.value = Double.parseDouble(value);
    }

    @Override
    public void sumOperation(String value1, String value2) {
        setValue(Double.toString(Double.parseDouble(value1) + Double.parseDouble(value2)));
    }

    @Override
    public void subOperation(String value1, String value2) {
        setValue(Double.toString(Double.parseDouble(value1) - Double.parseDouble(value2)));
    }

    @Override
    public void multOperation(String value1, String value2) {
        setValue(Double.toString(Double.parseDouble(value1) * Double.parseDouble(value2)));
    }

    @Override
    public void divOperation(String value1, String value2) {
        setValue(Double.toString(Double.parseDouble(value1) / Double.parseDouble(value2)));
    }

    @Override
    public void moduleOperation(String value1, String value2) {
        setValue(Double.toString(Double.parseDouble(value1) % Double.parseDouble(value2)));
    }
}