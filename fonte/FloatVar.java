public class FloatVar extends Variables {

    private Float value;

    public FloatVar(Float value, String identifier) {
        this.value = value;
        setIdentifier(identifier);
    }

    @Override
    public String getValue() {
        return Float.toString(this.value);
    }

    @Override
    public void setValue(String value) {
        this.value = Float.parseFloat(value);
    }

    @Override
    public void sumOperation(String value1, String value2) {
        setValue(Float.toString(Float.parseFloat(value1) + Float.parseFloat(value2)));
    }

    @Override
    public void subOperation(String value1, String value2) {
        setValue(Float.toString(Float.parseFloat(value1) - Float.parseFloat(value2)));
    }

    @Override
    public void multOperation(String value1, String value2) {
        setValue(Float.toString(Float.parseFloat(value1) * Float.parseFloat(value2)));
    }

    @Override
    public void divOperation(String value1, String value2) {
        setValue(Float.toString(Float.parseFloat(value1) / Float.parseFloat(value2)));
    }

    @Override
    public void moduleOperation(String value1, String value2) {
        setValue(Float.toString(Float.parseFloat(value1) % Float.parseFloat(value2)));
    }
}