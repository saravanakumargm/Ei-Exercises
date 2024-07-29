public class Food {
    private Strategy myMethod;
    void setMyMethod(Strategy myMethod){
        this.myMethod = myMethod;
    }
    public double getFoodCost(){
        return myMethod.foodCost();
    }
}
