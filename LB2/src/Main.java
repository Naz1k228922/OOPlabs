import java.util.Scanner;

public class Main
{
    private Song[] songs;

    //Метод згенерований за допомогою чату GPT
    public void createSongArray()
    {
        songs = new Song[5]; // Розмір масиву - 5 елементів

        songs[0] = new Song(1, "Title1", "Artist1", "Album1", "Genre1", "Lyricist1", "Language1", 2000, 3.5);
        songs[1] = new Song(2, "Title2", "Artist2", "Album2", "Genre2", "Lyricist2", "Language2", 2005, 4.2);
        songs[2] = new Song(3, "Title3", "Artist1", "Album3", "Genre1", "Lyricist3", "Language1", 2010, 3.8);
        songs[3] = new Song(4, "Title4", "Artist3", "Album4", "Genre3", "Lyricist4", "Language3", 2015, 5.0);
        songs[4] = new Song(5, "Title5", "Artist2", "Album5", "Genre2", "Lyricist5", "Language2", 2020, 4.5);
    }

    public void printSongsByFilter(String filterOption)
    {
        Scanner scanner = new Scanner(System.in);
        switch (filterOption)
        {
            case "artist":
                System.out.println("Enter artist name:");
                String artist = scanner.nextLine();
                printSongsByArtist(artist);
                break;
            case "genre":
                System.out.println("Enter genre:");
                String genre = scanner.nextLine();
                printSongsByGenre(genre);
                break;
            case "releaseYear":
                System.out.println("Enter start year:");
                Integer startYear = (int) Math.round(scanner.nextDouble()); // Округлення до цілого числа
                System.out.println("Enter end year:");
                Integer endYear = (int) Math.round(scanner.nextDouble()); // Округлення до цілого числа
                printSongsByReleaseYearRange(startYear, endYear);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void printSongsByArtist(String artist)
    {
        System.out.println("Songs by artist " + artist + ":");
        for (Song song : songs)
        {
            if (song.getArtist().equals(artist))
            {
                System.out.println(song);
            }
        }
    }

    public void printSongsByGenre(String genre)
    {
        System.out.println("Songs in genre " + genre + ":");
        for (Song song : songs)
        {
            if (song.getGenre().equals(genre))
            {
                System.out.println(song);
            }
        }
    }

    public void printSongsByReleaseYearRange(Integer startYear, Integer endYear)
    {
        System.out.println("Songs released between " + startYear + " and " + endYear + ":");
        for (Song song : songs)
        {
            if (song.getReleaseYear() >= startYear && song.getReleaseYear() <= endYear)
            {
                System.out.println(song);
            }
        }
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.createSongArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose filter option (artist / genre / releaseYear):");
        String filterOption = scanner.nextLine();

        main.printSongsByFilter(filterOption);
    }
}
