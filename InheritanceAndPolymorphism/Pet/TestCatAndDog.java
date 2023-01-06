package Pet;

public class TestCatAndDog {
    public static void main(String[] args) {
        
        Cat myCat = new Cat( );
        myCat.setName("Puff Puff");

        System.out.println(myCat.getName( ) + " says: ");
        System.out.println(myCat.speak( ));
        
        
        Dog myDog = new Dog( );
        myDog.setName("Fifi");

        System.out.println(myDog.getName( ) + " says: ");
        System.out.println(myDog.speak( ));
        System.out.println(myDog.fetch( ));
        
        Pet p;

        p = new Dog( );
        //System.out.println(p.fetch( )); //NOT VALID
        
        System.out.println(((Dog)p).fetch( )); //VALID; need to typecast
    }
}
