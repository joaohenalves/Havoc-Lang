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
    public void sumOperation(String value) {
        this.value.concat(value);
    }

    @Override
    public void subOperation(String value) {}

    @Override
    public void multOperation(String value) {
        this.value.repeat(Integer.parseInt(value));
    }

    @Override
    public void divOperation(String value) {}

    @Override
    public void moduleOperation(String value) {}
    
    @Override
    public boolean moreThanOperation(String value) { return false; }

    @Override
    public boolean lessThanOperation(String value) { return false; }

    @Override
    public boolean equalsOperation(String value) { return false; }

    @Override
    public boolean moreOrEqualOperation(String value) { return false; }

    @Override
    public boolean lessOrEqualOperation(String value) { return false; }
}