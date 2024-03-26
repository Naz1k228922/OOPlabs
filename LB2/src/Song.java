public class Song {
    public Integer id;
    public String title;
    public String artist;
    public String album;
    public String genre;
    public String lyricsAuthor;
    public String language;
    public Integer releaseYear;
    public Double length;
    public static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    public Song() {
        this.id = ++counter;
        this.title = "Title1";
        this.artist = "Artist1";
        this.album = "Album1";
        this.genre = "Genre1";
        this.lyricsAuthor = "Lyricist1";
        this.language = "Language1";
        this.releaseYear = 2000;
        this.length = 3.5;
    }

    public Song(Integer id, String title, String artist, String album, String genre, String lyricsAuthor, String language, Integer releaseYear, Double length) {
        counter++;
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.lyricsAuthor = lyricsAuthor;
        this.language = language;
        this.releaseYear = releaseYear;
        this.length = length;
    }

    public Song(Integer id, String title, String artist, String album, String genre) {
        counter++;
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.lyricsAuthor = "Lyricist1";
        this.language = "Language1";
        this.releaseYear = 2000;
        this.length = 3.5;
    }

    public Song(String lyricsAuthor, String language, Integer releaseYear, Double length) {
        this.id = ++counter;
        this.title = "Title1";
        this.artist = "Artist1";
        this.album = "Album1";
        this.genre = "Genre1";
        this.lyricsAuthor = lyricsAuthor;
        this.language = language;
        this.releaseYear = releaseYear;
        this.length = length;
    }

    public Song(Song other) {
        this.id = ++counter;
        this.title = other.title;
        this.artist = other.artist;
        this.album = other.album;
        this.genre = other.genre;
        this.lyricsAuthor = other.lyricsAuthor;
        this.language = other.language;
        this.releaseYear = other.releaseYear;
        this.length = other.length;
    }

    // Методи-гетери
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public String getLyricsAuthor() {
        return lyricsAuthor;
    }

    public String getLanguage() {
        return language;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", genre='" + genre + '\'' +
                ", lyricsAuthor='" + lyricsAuthor + '\'' +
                ", language='" + language + '\'' +
                ", releaseYear=" + releaseYear +
                ", length=" + length +
                '}';
    }


}
