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
    public void sumOperation(String value) {
        setValue(Float.toString(this.value + Float.parseFloat(value)));
    }

    @Override
    public void subOperation(String value) {
        setValue(Float.toString(this.value - Float.parseFloat(value)));
    }

    @Override
    public void multOperation(String value) {
        setValue(Float.toString(this.value * Float.parseFloat(value)));
    }

    @Override
    public void divOperation(String value) {
        setValue(Float.toString(this.value / Float.parseFloat(value)));
    }

    @Override
    public void moduleOperation(String value) {
        setValue(Float.toString(this.value % Float.parseFloat(value)));
    }
    
    @Override
    public boolean moreThanOperation(String value) {
        if (this.value > Float.parseFloat(value)) {return true;} else {return false;}
    }

    @Override
    public boolean lessThanOperation(String value) {
        if (this.value < Float.parseFloat(value)) {return true;} else {return false;}
    }

    @Override
    public boolean equalsOperation(String value) {
        if (this.value == Float.parseFloat(value)) {return true;} else {return false;}
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