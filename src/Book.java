public class Book {
     private final String name;
     private final Author authorName;
     private int publishingYear;

    public Book(String name, Author authorName, int publishingYear ){
        this.name = name;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getName(){
        return this.name;
    }
    public Author getAuthorName(){
        return this.authorName;
    }

    public int getPublishingYear(){
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }

    public String toString(){
        return name+","+authorName+","+publishingYear;
    }

    public boolean equals(Object obj){
        Book otherBook = (Book) obj;
        return this.name == otherBook.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
