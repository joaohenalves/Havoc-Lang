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
    public void sumOperation(String value) {
        setValue(Long.toString(this.value + Long.parseLong(value)));
    }

    @Override
    public void subOperation(String value) {
        setValue(Long.toString(this.value - Long.parseLong(value)));
    }

    @Override
    public void multOperation(String value) {
        setValue(Long.toString(this.value * Long.parseLong(value)));
    }

    @Override
    public void divOperation(String value) {
        setValue(Long.toString(this.value / Long.parseLong(value)));
    }

    @Override
    public void moduleOperation(String value) {
        setValue(Long.toString(this.value % Long.parseLong(value)));
    }
    
    @Override
    public boolean moreThanOperation(String value) {
        if (this.value > Long.parseLong(value)) {return true;} else {return false;}
    }

    @Override
    public boolean lessThanOperation(String value) {
        if (this.value < Long.parseLong(value)) {return true;} else {return false;}
    }

    @Override
    public boolean equalsOperation(String value) {
        if (this.value == Long.parseLong(value)) {return true;} else {return false;}
    }

    @Override
    public boolean moreOrEqualOperation(String value) {
        if (moreThanOperation(value) && equalsOperation(value))
            {return true;} else {return false;}
    }

    @Override
    public boolean lessOrEqualOperation(String value) {
        if (lessThanOperation(value) && equalsOperation(value))
            {return true;} else {return false;}
    }
}