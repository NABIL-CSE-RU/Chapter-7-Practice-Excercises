package Excercise10;

public class DataSetRunner {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet(5);

        dataSet.add(34);
        dataSet.add(3);
        dataSet.add(4);
        dataSet.add(347);
        dataSet.add(54);

        System.out.println("Sum: " + dataSet.getSum());
        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Maximum: " + dataSet.getMax());
        System.out.println("Minimum: " + dataSet.getMin());
    }
}
