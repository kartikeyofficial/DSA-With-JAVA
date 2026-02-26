class Inheritance {
    String color;
    String Model;
    int noOfWheels;
    double prise;

}
class Car extends Inheritance{
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return  color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

}
class TestInheritance extends Car{
    static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setModel("Mustang gt");
        car.setPrise(7000000);
        car.setNoOfWheels(4);
        System.out.println("Car Color: "+car.getColor()
                +"\nCar Model: "+car.getModel()
                +"\nCar Prise: "+car.getPrise()
                +"\nCar Total No. of Wheels: "+car.getNoOfWheels());
    }
}
