public abstract class Variables {

    private String identifier;

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public abstract String getValue();
    
    public abstract void setValue(String value);

    public abstract void sumOperation(String value);

    public abstract void subOperation(String value);

    public abstract void multOperation(String value);

    public abstract void divOperation(String value);

    public abstract void moduleOperation(String value);
    
    public abstract boolean moreThanOperation(String value);

    public abstract boolean lessThanOperation(String value);

    public abstract boolean equalsOperation(String value);

    public abstract boolean moreOrEqualOperation(String value);

    public abstract boolean lessOrEqualOperation(String value);
}