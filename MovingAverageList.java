/**
 * This data structure provides the moving average of the last N elements added to it. It also allows arbitrary
 * access to the elements.
 */
public interface MovingAverageList{
    /**
     * Adds a specified number to the list.
     *
     * @param num a number to be added to the list
     */
    void add(double num);

    /**
     * Returns a number from the specified index in the list.
     *
     * @param index index of the number to return
     * @return the number at the specified index the list
     */
    double get(int index);

    /**
     * Returns the moving average of the last N numbers in the list.
     *
     * @return moving average
     */
    double getMovingAverage();
}