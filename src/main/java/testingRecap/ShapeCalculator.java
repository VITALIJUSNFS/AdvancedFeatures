package testingRecap;

public class ShapeCalculator {

    public double calculateSquareArea(double height, double width) {
        if (height <=0 || width <=0){
            System.out.println("Err, below 0");
        }
        return height * width;
    }

    public  double calculateSquareVolume(double height, double width, double length){
        return  height * width * length;
    }
}
