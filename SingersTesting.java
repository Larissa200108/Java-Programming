package Exercise1;

public class SingersTesting {
    public static void main(String[] args) {
        // Create singer object using no-argument constructor
        Singers singer1 = new Singers();

        // Display default values
        System.out.println("Default Singer details: " + singer1.toString());

        // Set values using individual setters
        singer1.setId(1);
        singer1.setName("Nicki Minaj");
        singer1.setAddress("California, USA");
        singer1.setDateOfBirth("12-08-1982");
        singer1.setPublishedAlbums(5);

        // Display updated values
        System.out.println("Updated Singer details: " + singer1.toString());

        // Set all values at once using the setAllDetails method
        singer1.setAllDetails(2, "Rihanna", "Beverly Hills, USA", "02-20-1988", 8);

        // Display new updated values
        System.out.println("Updated Singer details after setAllDetails: " + singer1.toString());
    }
}
