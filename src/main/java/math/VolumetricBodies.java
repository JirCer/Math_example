package math;

public class VolumetricBodies {


    public double volumeOfTheCube(double a)

    {

        return a * a * a;

    }

    public double surfaceAreaOfTheCube(double a)

    {

        return 6 * a * a;

    }

    public double volumeofTheSphere(double r)

    {
        double volumeofTheSphere = 4/3.0 * Math.PI * r * r * r;
        long roundedNumber = Math.round(volumeofTheSphere);

        return roundedNumber;

    }

    public double surfaceAreaOfTheSphere(double r)

    {
        double surfaceAreaOfTheSphere = 4 * Math.PI * r * r;
        long roundedNumber = Math.round(surfaceAreaOfTheSphere);

        return roundedNumber;

    }

    public double volumeOfTheCylinder(double h, double r)

    {
        double volumeOfTheCylinder = Math.PI * r * r * h;
        long roundedNumber = Math.round(volumeOfTheCylinder);

        return roundedNumber;

    }

    public double surfaceAreaOfTheCylinder(double h, double r)

    {

        double baseArea = 2 * (Math.PI * r * r);
        double shellArea = 2 * Math.PI * r * h;
        double surfaceAreaOfTheCylinder = baseArea + shellArea;
        long roundedNumber = Math.round(surfaceAreaOfTheCylinder);

        return roundedNumber;

    }

    public double volumeOfTheCone(double h, double r)

    {

        double volumeOfTheCone = 1/3.0 * Math.PI * r * r * h;
        long roundedNumber = Math.round(volumeOfTheCone);

        return roundedNumber;

    }

    public double surfaceAreaOfTheCone(double h, double r)

    {

        double side = Math.sqrt(r * r + h * h);
        double surfaceAreaOfTheCone = Math.PI * r * r + Math.PI * r * side;
        long roundedNumber = Math.round(surfaceAreaOfTheCone);

        return roundedNumber;

    }

}
