public class volOfEarth {
        public static void main(String[] args) {
            // Define constants
            double radiusKm = 6378;
            double kmToMiles = 0.621371;
            
            // Calculate volume in cubic kilometers
            double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
            
            // Convert volume to cubic miles
            double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);
            
            // Print the results
            System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f\n", volumeKm3, volumeMiles3);
        }
    }
