public class DoubleVar extends Variables {

    private Double value;

    public DoubleVar(Double value, String identifier) {
        this.value = value;
        setIdentifier(identifier);
    }

    @Override
    public String getValue() {
        return Double.toString(this.value);
    }

    @Override
    public void setValue(String value) {
        this.value = Double.parseDouble(value);
    }

    @Override
    public void sumOperation(String value) {
        setValue(Double.toString(this.value + Double.parseDouble(value)));
    }

    @Override
    public void subOperation(String value) {
        setValue(Double.toString(this.value - Double.parseDouble(value)));
    }

    @Override
    public void multOperation(String value) {
        setValue(Double.toString(this.value * Double.parseDouble(value)));
    }

    @Override
    public void divOperation(String value) {
        setValue(Double.toString(this.value / Double.parseDouble(value)));
    }

    @Override
    public void moduleOperation(String value) {
        setValue(Double.toString(this.value % Double.parseDouble(value)));
    }
    
    @Override
    public boolean moreThanOperation(String value) {
        if (this.value > Double.parseDouble(value)) {return true;} else {return false;}
    }

    @Override
    public boolean lessThanOperation(String value) {
        if (this.value < Double.parseDouble(value)) {return true;} else {return false;}
    }

    @Override
    public boolean equalsOperation(String value) {
        if (this.value == Double.parseDouble(value)) {return true;} else {return false;}
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