// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        q1
Book b1=new Book("Word",50,"Roaa");
        Book b2=new Book("Life",60,"Ali");
        System.out.println("Book name :  "+b1.getName()+" , Price : "+b1.getPrice()+" , After discount :"+b1.getDiscount()+" , Author :"+b1.getAuthor());
        System.out.println("Book name :  "+b2.getName()+" , Price : "+b2.getPrice()+" , After discount :"+b2.getDiscount()+" , Author :"+b2.getAuthor());
        Movie m1= new Movie("Movie 1",70,"Amal");
        Movie m2= new Movie("Movie 2",65,"Ahmed");
        System.out.println("Movie name :  "+m1.getName()+" , Price : "+m1.getPrice()+" , After discount :"+m1.getDiscount()+" , Author :"+m1.getDirector());
        System.out.println("Movie name :  "+m2.getName()+" , Price : "+m2.getPrice()+" , After discount :"+m2.getDiscount()+" , Author :"+m2.getDirector());
//Q2
    MovablePoint m=new MovablePoint(4,9,10,5);
        System.out.println(m.getX()+","+ m.getY());
    }
}