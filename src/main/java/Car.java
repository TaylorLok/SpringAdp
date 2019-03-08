import java.util.Objects;

public class Car
{
   private String CarName;
    private String CarId;
    private String CarModel;
    private String OwnerName;
    private double Price;


    public Car()
    {

    }

    public String getCarName()
    {
        return CarName;
    }

    public String getCarId()
    {
        return CarId;
    }

    public String getCarModel()
    {
        return CarModel;
    }

    public String getOwnerName()
    {
        return OwnerName;
    }

    public double getPrice()
    {
        return Price;
    }

    public Car(Builder builder)
    {
        this.CarName = builder.CarName;
        this.CarId = builder.CarId;
        this.CarModel = builder.CarModel;
        this.OwnerName = builder.OwnerName;
        this.Price = builder.Price;
    }


    public static class Builder {
        private String CarName;
        private String CarId;
        private String CarModel;
        private String OwnerName;
        private double Price;


        public Builder CarName(String value) {
            this.CarName = value;
            return this;
        }

        public Builder CarId(String value) {
            this.CarId = value;
            return this;
        }

        public Builder CarModel(String value) {
            this.CarModel = value;
            return this;
        }

        public Builder OwnerName(String value)
        {
            this.OwnerName = value;
            return this;
        }

        public Builder Price(double value)
        {
            this.Price = value;
            return this;
        }


        public Car build()
        {
            return new Car(this);
        }

    }// close build

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(CarId, car.CarId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(CarId);
    }

    public void DisplayCar()
    {
        System.out.println("this Car is own by:"+getOwnerName()+"the car name is:"+getCarName()+
                "Model"+getCarModel()+"the car id is:"+getCarId()+ "it cost:R"+this.getPrice());

    }

    public void Buycar()
    {
        System.out.println(toString());
    }

}
