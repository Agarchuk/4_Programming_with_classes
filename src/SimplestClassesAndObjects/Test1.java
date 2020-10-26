package SimplestClassesAndObjects;

public class Test1 {
    int param1;
    int param2;

    public Test1(int param1, int param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "param1=" + param1 +
                ", param2=" + param2 +
                '}';
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }
    public int summ(){
        return param1+param2;
    }
    public int max(){
        if(param1>param2){
            return param1;
        } else{
            return param2;
        }
    }
}
