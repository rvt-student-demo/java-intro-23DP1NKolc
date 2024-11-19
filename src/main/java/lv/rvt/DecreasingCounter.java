package lv.rvt;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }
    public void reset() {
        this.value=0;
        }
    public void increaseValue() {
        this.value+=1;
        
    }
    public void decreaseValue() {
        if(this.value>0){
        this.value-=1;
        }
    }
    public void increaseValue(int increaseBy){
            this.value+=increaseBy;
    }
    public void decreaseValue(int decreaseBy){
        if((this.value-decreaseBy)>0){
            this.value-=decreaseBy;
        }
        else{
            this.value=0;
        }
    }
    public int getValue() {
        return value;
    }
}
