import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        // ---- CHILD CLASS ----
        // 1. Instantiate the Child class 5 times
        Child child1 = new Child(); // Using default constructor
        Child child2 = new Child(); // Using default constructor
        Child child3 = new Child("John"); // Using the first constructor
        Child child4 = new Child("Jane", "Doe"); // Using the second constructor
        Child child5 = new Child("Jack", "Smith", 12); // Using the third constructor

        // 2. Output the toString() method for each Child Object
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(child4.toString());
        System.out.println(child5.toString());

        // 3. Determine equality
        boolean areDefaultEqual = child1.equals(child2); // Compare two default objects
        boolean isFirstEqualSecond = child3.equals(child4); // Compare first and second constructor objects
        boolean isSecondEqualThird = child4.equals(child5); // Compare second and third constructor objects

        // 4. Output all Boolean values
        System.out.println("Are default constructor objects equal? " + areDefaultEqual);
        System.out.println("Is first constructor equal to second constructor? " + isFirstEqualSecond);
        System.out.println("Is second constructor equal to third constructor? " + isSecondEqualThird);

        // ---- ADOLESCENT CLASS ---
        Adolescent adolescent1 = new Adolescent();
        Adolescent adolescent2 = new Adolescent();
        Adolescent adolescent3 = new Adolescent("Alice", "Brown", 15, "Chris", true, new ArrayList<>(), "Positive", 8); // Full constructor
        Adolescent adolescent4 = new Adolescent("Bob", "Green", 16, "David", true, new ArrayList<>(), 5); // Parent vars + outgoingness
        Adolescent adolescent5 = new Adolescent("Eve", "Smith", 14, "Anna", false, new ArrayList<>()); // Parent vars
        Adolescent adolescent6 = new Adolescent("George", "Gray", 17, "Paul", true, new ArrayList<>(), "Neutral", 6); //

        // Output the toString() method for each Adolescent
        System.out.println(adolescent1.toString());
        System.out.println(adolescent2.toString());
        System.out.println(adolescent3.toString());
        System.out.println(adolescent4.toString());
        System.out.println(adolescent5.toString());
        System.out.println(adolescent6.toString());

        //intitializing the boolean variables
        boolean areDefaultAdolescentsEqual = adolescent1.equals(adolescent2);
        boolean isFirstEqualSecondAdolescent = adolescent3.equals(adolescent4);
        boolean isSecondEqualThirdAdolescent = adolescent4.equals(adolescent5);
        boolean isThirdEqualFourthAdolescent = adolescent5.equals(adolescent6);

        //Boolean outputs
        System.out.println("Are default adolescent objects equal? " + areDefaultAdolescentsEqual);
        System.out.println("Is first constructor equal to second constructor? " + isFirstEqualSecondAdolescent);
        System.out.println("Is second constructor equal to third constructor? " + isSecondEqualThirdAdolescent);
        System.out.println("Is third constructor equal to fourth constructor? " + isThirdEqualFourthAdolescent);
    }
}