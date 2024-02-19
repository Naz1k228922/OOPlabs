public class Song
{
    public int id;
    public String title;
    public String artist;
    public String album;
    public String genre;
    public String lyricsAuthor;
    public String language;
    public int releaseYear;
    public double length;

    public Song(int id, String title, String artist, String album, String genre, String lyricsAuthor, String language, int releaseYear, double length)
    {
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

    // Методи-гетери
    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getAlbum()
    {
        return album;
    }

    public String getGenre()
    {
        return genre;
    }

    public String getLyricsAuthor()
    {
        return lyricsAuthor;
    }

    public String getLanguage()
    {
        return language;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

    public double getLength()
    {
        return length;
    }

    @Override
    public String toString()
    {
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
