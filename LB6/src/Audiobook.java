class Audiobook extends Base {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private double duration;
    private double price;
    private String audioFormat;

    public Audiobook() {
        super(0);
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.publicationYear = 0;
        this.duration = 0.0;
        this.price = 0.0;
        this.audioFormat = "";
    }

    public Audiobook(int id, String title, String author, String publisher, int publicationYear, double duration, double price, String audioFormat) {
        super(id);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.duration = duration;
        this.price = price;
        this.audioFormat = audioFormat;
    }

    public Audiobook(Audiobook other) {
        super(other.getId());
        this.title = other.title;
        this.author = other.author;
        this.publisher = other.publisher;
        this.publicationYear = other.publicationYear;
        this.duration = other.duration;
        this.price = other.price;
        this.audioFormat = other.audioFormat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    @Override
    public String toString() {
        return "Audiobook{" +
                "id=" + getId() +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", duration='" + duration + '\'' +
                ", price='" + price + '\'' +
                ", audioFormat='" + audioFormat + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public void displayInfo() {
        System.out.println("Audiobook Information:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Price: $" + price);
        System.out.println("Audio Format: " + audioFormat);
    }
}