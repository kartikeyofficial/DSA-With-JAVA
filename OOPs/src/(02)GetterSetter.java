class GetterSetter {
   String carName;
   String color;
   float fuelInTank;
   float prise;

   public void setCarName(String carName){
       this.carName = carName;
   }
   public String getCarName(){
       return carName;
   }
   public void setColor(String color){
       this.color = color;
   }
   public String getColor(){
       return color;
   }
   public void setFuelInTank(float fuelInTank){
       this.fuelInTank = fuelInTank;
   }
   public float getFuelInTank(){
       return fuelInTank;
   }
   public void setPrise(float prise){
       this.prise = prise;
   }
   public float getPrise() {
        return prise;
    }
}
class testCar{
    static void main(String[] args) {
        GetterSetter gs = new GetterSetter();
        gs.setCarName("Bolero");
        System.out.println(gs.getCarName());
        gs.setColor("White");
        System.out.println(gs.getColor());
        gs.setPrise(800000);
        System.out.println(gs.getPrise());
        gs.setFuelInTank(3);
        System.out.println(gs.getFuelInTank());


    }
}
