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

    public abstract void sumOperation(String value1, String value2);

    public abstract void subOperation(String value1, String value2);

    public abstract void multOperation(String value1, String value2);

    public abstract void divOperation(String value1, String value2);

    public abstract void moduleOperation(String value1, String value2);
}