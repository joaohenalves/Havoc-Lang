public class BooleanVar extends Variables {

    private Boolean value;

    public BooleanVar(Boolean value, String identifier) {
        this.value = value;
        setIdentifier(identifier);
    }

    @Override
    public String getValue() {
        return Boolean.toString(this.value);
    }

    @Override
    public void setValue(String value) {
        this.value = Boolean.parseBoolean(value);
    }

    @Override
    public void sumOperation(String value1, String value2) {}

    @Override
    public void subOperation(String value1, String value2) {}

    @Override
    public void multOperation(String value1, String value2) {}

    @Override
    public void divOperation(String value1, String value2) {}

    @Override
    public void moduleOperation(String value1, String value2) {}
}
