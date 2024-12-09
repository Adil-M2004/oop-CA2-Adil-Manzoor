package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    /**
     * This class represents a connection between two cities in the graph.
     * It stores the target city and the distance to that city.
     */
    public static class DistanceTo implements Comparable<DistanceTo> {


        //The target city of this connection.

        private String target;


        //The distance to the target city.

        private int distance;

        //
    //     * Constructs a new DistanceTo object.
    //     *
    //     * @param city   The target city.
    //     * @param dist   The distance to the target city.
    //
        public DistanceTo(String city, int dist) {
            target = city;
            distance = dist;
        }


    //     * Gets the target city of this connection.
    //     *
    //     * @return The target city.

        public String getTarget() {
            return target;
        }


    //     * Gets the distance to the target city.
    //     *
    //     * @return The distance to the target city.

        public int getDistance() {
            return distance;
        }


    //     * Compares this DistanceTo object to another DistanceTo object based on their distances.
    //     *
    //     * @param other The other DistanceTo object to compare with.
    //     * @return A negative integer, zero, or a positive integer as this object's distance is less than, equal to, or greater than
    //     *         the specified object's distance.

        @Override
        public int compareTo(DistanceTo other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
}