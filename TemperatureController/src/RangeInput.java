public class RangeInput {
    private int currentTemperature, minTemperature, maxTemperature;
    public RangeInput(){
        minTemperature = 50;
        maxTemperature = 90;
        newTemperature();
    }
    public RangeInput(int min, int max) {
        this.minTemperature = min;
        this.maxTemperature = max;
        newTemperature();
    }
   public void newTemperature() {

        currentTemperature = (maxTemperature + minTemperature) / 2;
    }
    void up(){

        currentTemperature = Math.min(currentTemperature + 1 ,maxTemperature);
    }
  void down(){

        currentTemperature = Math.max(currentTemperature - 1, minTemperature);
  }
  public int getCurrentTemperature(){
        return currentTemperature;
  }
}
