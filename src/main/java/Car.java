
import java.security.KeyStore;
import java.util.Objects;

public class Car
{
    private String CarName;
    private String CarId;
    private String CarModel;


    private Car()
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

    public Car(Builder builder)
    {
        this.CarName = builder.CarName;
        this.CarId = builder.CarId;
        this.CarModel = builder.CarModel;
    }

    public static class Builder
    {
        private String CarName;
        private String CarId;
        private String CarModel;


        public Builder CarName(String value)
        {
            this.CarName = value;
            return this;
        }

        public Builder CarId(String value)
        {
            this.CarId = value;
            return this;
        }

        public Builder CarModel(String value)
        {
            this.CarModel = value;
            return this;
        }


        public Car build()//methode to
        {
            return new Car(this);
        }

    }// close build

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(CarId, car.CarId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CarId);
    }
}
