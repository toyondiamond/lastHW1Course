public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String toString(){
        return authorName +","+authorSurname;
    }
    public boolean equals(Object obj){
        Author otherAuthor = (Author) obj;
        return this.authorSurname == otherAuthor.authorSurname;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }
}
