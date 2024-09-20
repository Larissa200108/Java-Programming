package Exercise1;

public class Singers {
    // Instance variables
    private int id;
    private String name;
    private String address;
    private String dateOfBirth;
    private int publishedAlbums;

    // No-argument constructor
    public Singers() {
        this.id = 0;
        this.name = "Unknown";
        this.address = "Unknown";
        this.dateOfBirth = "Unknown";
        this.publishedAlbums = 0;
    }

    // Constructor with 1 argument
    public Singers(int id) {
        this.id = id;
    }

    // Constructor with 2 arguments
    public Singers(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with 3 arguments
    public Singers(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Constructor with 4 arguments
    public Singers(int id, String name, String address, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    // Constructor with 5 arguments
    public Singers(int id, String name, String address, String dateOfBirth, int publishedAlbums) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.publishedAlbums = publishedAlbums;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPublishedAlbums() {
        return publishedAlbums;
    }

    public void setPublishedAlbums(int publishedAlbums) {
        this.publishedAlbums = publishedAlbums;
    }

    // Method to set all instance variables at once
    public void setAllDetails(int id, String name, String address, String dateOfBirth, int publishedAlbums) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.publishedAlbums = publishedAlbums;
    }

    @Override
    public String toString() {
        return "Singers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", publishedAlbums=" + publishedAlbums +
                '}';
    }
}
