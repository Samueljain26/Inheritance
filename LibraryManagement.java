//main class
public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 =new Author("java",2001,"abc","First Book");
        Book book2 =new Author("C++",2002,"xyz","Second Book");
        //polymorphism
        book1.displayInfo();
        book2.displayInfo();
    }
}
//superclass
class Book{
    String title;
    int publicationYear;
//constructor
Book(String title,int publicationYear){
    this.title=title;
    this.publicationYear=publicationYear;
}
//method
void displayInfo() {
    System.out.println("Book -> Title: " + title + ", Publication Year: " + publicationYear);
}
}
//subclass
class Author extends Book{ //extends for inheritance
    String name;
    String bio;
//constructor
    Author(String title,int publicationYear, String name,String bio ){
        super(title,publicationYear); //super keyword
        this.name=name;
        this.bio =bio;
    }
    @Override
    public void displayInfo(){
        System.out.println("Book ->  Title: "+title +" Publication Year: " +publicationYear + " Author Name: "+ name +" Bio: " +bio );

    }
}
/*Book ->  Title: java Publication Year: 2001 Author Name: abc Bio: First Book
Book ->  Title: C++ Publication Year: 2002 Author Name: xyz Bio: Second Book */