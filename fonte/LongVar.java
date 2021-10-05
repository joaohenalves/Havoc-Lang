public class LongVar extends Variables {

    private Long value;

    public LongVar(Long value, String identifier) {
        this.value = value;
        setIdentifier(identifier);
    }

    @Override
    public String getValue() {
        return Long.toString(this.value);
    }

    @Override
    public void setValue(String value) {
        this.value = Long.parseLong(value);
    }

    @Override
    public void sumOperation(String value1, String value2) {
        setValue(Long.toString(Long.parseLong(value1) + Long.parseLong(value2)));
    }

    @Override
    public void subOperation(String value1, String value2) {
        setValue(Long.toString(Long.parseLong(value1) - Long.parseLong(value2)));
    }

    @Override
    public void multOperation(String value1, String value2) {
        setValue(Long.toString(Long.parseLong(value1) * Long.parseLong(value2)));
    }

    @Override
    public void divOperation(String value1, String value2) {
        setValue(Long.toString(Long.parseLong(value1) / Long.parseLong(value2)));
    }

    @Override
    public void moduleOperation(String value1, String value2) {
        setValue(Long.toString(Long.parseLong(value1) % Long.parseLong(value2)));
    }
}