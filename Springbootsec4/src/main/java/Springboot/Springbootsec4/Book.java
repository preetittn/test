package Springboot.Springbootsec4;

public class Book
{
    long id;
    String name;
    String author;

    public Book(long id, String name, String author)                  //constructor
    {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {                                   //getters
        return id;
    }                                   //getters

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString()                                           //toString
    {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
