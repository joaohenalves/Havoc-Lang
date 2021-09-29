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
    public void sumOperation(String value) {}

    @Override
    public void subOperation(String value) {}

    @Override
    public void multOperation(String value) {}

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
