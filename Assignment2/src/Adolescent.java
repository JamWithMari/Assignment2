import java.util.ArrayList;

public class Adolescent extends Child {
    // Instance variables specific to Adolescent
    private String attitude;
    private int outgoingness;

    // Default Constructor
    public Adolescent() {
        super(); // Call parent class default constructor
        this.attitude = ""; // Default value for attitude
        this.outgoingness = 0; // Default value for outgoingness
    }

    // Full Constructor (Parent + New Variables)
    public Adolescent(String firstName, String lastName, int age, String bestFriend, boolean freeTime, ArrayList<String> responsibilities, String attitude, int outgoingness) {
        super(firstName, lastName, age, bestFriend, freeTime, responsibilities); // Parent constructor
        this.attitude = attitude;
        this.outgoingness = outgoingness;
    }

    // Constructor for Parent Variables + Outgoingness
    public Adolescent(String firstName, String lastName, int age, String bestFriend, boolean freeTime, ArrayList<String> responsibilities, int outgoingness) {
        super(firstName, lastName, age, bestFriend, freeTime, responsibilities); // Call parent constructor
        this.outgoingness = outgoingness;
        this.attitude = ""; // Default value for attitude
    }

    public <E> Adolescent(String eve, String smith, int i, String anna, boolean b, ArrayList<E> es) {
    }

    // Accessor (getter) for attitude
    public String getAttitude() {
        return attitude;
    }

    // Mutator (setter) for attitude
    public void setAttitude(String attitude) {
        this.attitude = attitude;
    }

    // Accessor (getter) for outgoingness
    public int getOutgoingness() {
        return outgoingness;
    }

    // Mutator (setter) for outgoingness
    public void setOutgoingness(int outgoingness) {
        this.outgoingness = outgoingness;
    }

    // Override toString() Method
    @Override
    public String toString() {
        return super.toString() + ", attitude=" + attitude + ", outgoingness=" + outgoingness;
    }

    // Override equals() Method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false; // Check parent class equality first

        if (!(obj instanceof Adolescent)) return false; // Ensure the object is an Adolescent

        Adolescent otherAdolescent = (Adolescent) obj;

        return attitude.equals(otherAdolescent.getAttitude()) &&
                outgoingness == otherAdolescent.getOutgoingness();
    }

    // Override freeTime Mutator
    @Override
    public void setFreeTime(boolean freeTime) {
        // An adolescent only gets 1/3 of a child's free time conceptually
        super.setFreeTime(false); // Restrict free time
    }
}