import java.util.Scanner;

public class Main {
    private Song[] songs;
    private Base[] items;

    //Метод згенерований за допомогою чату GPT
    public void createSongArray() {
        songs = new Song[5]; // Розмір масиву - 5 елементів

        songs[0] = new Song();
        songs[1] = new Song(2, "Title2", "Artist2", "Album2", "Genre2", "Lyricist2", "Language2", 2005, 4.2);
        songs[2] = new Song(3, "Title3", "Artist1", "Album3", "Genre1");
        songs[3] = new Song("Lyricist4", "Language3", 2015, 5.0);
        songs[4] = new Song(songs[0]);
    }

    public void createObjects() {
        items = new Base[1];
        items[0] = new Audiobook();
    }

    public void displayObjectsInfo() {
        // Виведення інформації про об'єкти у консоль
        for (Base item : items) {
            item.displayInfo();
        }
    }


    public void printSongsByFilter(String filterOption) {
        Scanner scanner = new Scanner(System.in);
        switch (filterOption) {
            case "artist":
                printSongsByArtist();
                break;
            case "genre":
                printSongsByGenre();
                break;
            case "releaseYear":
                printSongsByReleaseYearRange();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void printSongsByArtist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter artist name:");
        String artist = scanner.nextLine();
        printSongsByArtist(artist);
    }

    public void printSongsByArtist(String artist) {
        System.out.println("Songs by artist " + artist + ":");
        for (Song song : songs) {
            if (song.getArtist().equals(artist)) {
                System.out.println(song);
            }
        }
    }

    public void printSongsByGenre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter genre:");
        String genre = scanner.nextLine();
        printSongsByGenre(genre);
    }

    public void printSongsByGenre(String genre) {
        System.out.println("Songs in genre " + genre + ":");
        for (Song song : songs) {
            if (song.getGenre().equals(genre)) {
                System.out.println(song);
            }
        }
    }

    public void printSongsByReleaseYearRange(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start year:");
        Integer startYear = (int) Math.round(scanner.nextDouble()); // Округлення до цілого числа
        System.out.println("Enter end year:");
        Integer endYear = (int) Math.round(scanner.nextDouble()); // Округлення до цілого числа
        printSongsByReleaseYearRange(startYear, endYear);
    }

    public void printSongsByReleaseYearRange(Integer startYear, Integer endYear) {
        System.out.println("Songs released between " + startYear + " and " + endYear + ":");
        for (Song song : songs) {
            if (song.getReleaseYear() >= startYear && song.getReleaseYear() <= endYear) {
                System.out.println(song);
            }
        }
    }



    public static void main(String[] args) {
        Main program = new Main();
        program.createObjects();
        program.displayObjectsInfo();
        Audiobook[] audiobooks = new Audiobook[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < audiobooks.length; i++) {
            System.out.println("Enter details for Audiobook " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            System.out.print("Publication Year: ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Duration (in hours): ");
            double duration = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Audio Format: ");
            String audioFormat = scanner.nextLine();

            audiobooks[i] = new Audiobook(id, title, author, publisher, publicationYear, duration, price, audioFormat);
        }

        for (Audiobook audiobook : audiobooks) {
            System.out.println(audiobook);
        }
    }
}
