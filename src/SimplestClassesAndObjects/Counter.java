package SimplestClassesAndObjects;

public class Counter {
    static int currentCount;
    int minvalue = 0;
    int maxvalue = 100;

    public Counter() {
    }
    public Counter(int currentCount){
        this.currentCount = currentCount;
    }
    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }
    public void increase(){
        if(currentCount<100){
            currentCount++;
        } else{
            currentCount = this.minvalue;
        }

    }
    public void decrease(){
        if(currentCount>0){
            currentCount-- ;
        } else{
            currentCount = this.maxvalue;
        }

    }
    public int current(){
        return currentCount;
    }
}
