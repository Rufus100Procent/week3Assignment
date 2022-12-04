package se.jensen.javacourse.week3.Mohamed.Athor;

public class Author {

    private int id;
    private String name;
    private int age;
    private int published_Books;

    public Author(String name, int age, int published_Books) {
        this.name = name;
        this.age = age;
        this.published_Books = published_Books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPublished_Books() {
        return published_Books;
    }

    public void setPublished_Books(int published_Books) {
        this.published_Books = published_Books;
    }
}
