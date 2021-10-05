public class IntegerVar extends Variables {

    private Integer value;

    public IntegerVar(Integer value, String identifier) {
        this.value = value;
        setIdentifier(identifier);
    }

    @Override
    public String getValue() {
        return Integer.toString(this.value);
    }

    @Override
    public void setValue(String value) {
        this.value = Integer.parseInt(value);
    }

    @Override
    public void sumOperation(String value1, String value2) {
        setValue(Integer.toString(Integer.parseInt(value1) + Integer.parseInt(value2)));
    }

    @Override
    public void subOperation(String value1, String value2) {
        setValue(Integer.toString(Integer.parseInt(value1) - Integer.parseInt(value2)));
    }

    @Override
    public void multOperation(String value1, String value2) {
        setValue(Integer.toString(Integer.parseInt(value1) * Integer.parseInt(value2)));
    }

    @Override
    public void divOperation(String value1, String value2) {
        setValue(Integer.toString(Integer.parseInt(value1) / Integer.parseInt(value2)));
    }

    @Override
    public void moduleOperation(String value1, String value2) {
        setValue(Integer.toString(Integer.parseInt(value1) % Integer.parseInt(value2)));
    }
}