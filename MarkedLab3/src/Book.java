public class Book implements Comparable<Book> {
    // Initialise variables
    private String title;
    private int pages;
    private int year;

    // Constructor, assign variables from parameters
    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    // Override compareTo, sort by title then by year
    @Override
    public int compareTo(Book other) {
        int titleCompare = this.title.compareTo(other.title);
        if (titleCompare != 0) {
            return titleCompare;
        }

        int yearCompare = Integer.compare(this.year, other.year);
        if (yearCompare != 0) {
            return yearCompare;
        }

        return Integer.compare(this.pages, other.pages);
    }

    // Override toString, overrides the toString (woah) and combines
    // all the variables into one line separated by a single space
    @Override
    public String toString() {
        return title + " " + year + " " + pages;
    }
}