public class StringVar extends Variables {

    private String value;

    public StringVar(String value, String identifier) {
        this.value = value;
        setIdentifier(identifier);
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void sumOperation(String value1, String value2) {
        setValue(value1.concat(value2));
    }

    @Override
    public void subOperation(String value1, String value2) {}

    @Override
    public void multOperation(String value1, String value2) {}

    @Override
    public void divOperation(String value1, String value2) {}

    @Override
    public void moduleOperation(String value1, String value2) {}
}