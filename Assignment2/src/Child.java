import java.util.ArrayList;

public class Child {
    private String firstName;
    private String lastName;
    private int age;
    private String bestFriend;
    //It would make most sense if this was a bool because we want to see if they're free or not
    private boolean freeTime;
    //Making the private array of strings for responsibilities
    private ArrayList<String> responsibilities = new ArrayList<>();


    public Child(String firstName, String lastName, int age, String bestFriend, boolean freeTime, ArrayList<String> responsibilities) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bestFriend = bestFriend;
        this.freeTime = freeTime;
        this.responsibilities = responsibilities;
    }

    //Default constructor
    public Child() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.bestFriend = "";
        this.freeTime = false;
        this.responsibilities = new ArrayList<>();
    }
    //Single String constructor
    public Child(String firstName){
        this.firstName = firstName;
        this.lastName = "";
        this.age = 0;
        this.bestFriend = "";
        this.freeTime = false;
        this.responsibilities = new ArrayList<>();
    }
    //2 String constructor
    public Child(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.bestFriend = "";
        this.freeTime = false;
        this.responsibilities = new ArrayList<>();
    }
    //2 strings 1 int for parameters
    public Child(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bestFriend = "";
        this.freeTime = false;
        this.responsibilities = new ArrayList<>();
    }
    //Override toString method
    @Override
    public String toString() {
        return "Child[firstName=" + firstName +
                ", lastName=" + lastName +
                ", age=" + age +
                ", bestFriend=" + bestFriend +
                ", freeTime=" + freeTime +
                ", responsibilities=" + responsibilities + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the references are the same
        if (this == obj) return true;

        // Check if the object is null or not of the same class
        if (obj == null || getClass() != obj.getClass()) return false;

        // Cast the object to Child for comparison
        Child otherChild = (Child) obj;

        // Compare each instance variable
        if (!firstName.equals(otherChild.getFirstName())) return false;
        if (!lastName.equals(otherChild.getLastName())) return false;
        if (age != otherChild.getAge()) return false;
        if (!bestFriend.equals(otherChild.getBestFriend())) return false;
        if (freeTime != otherChild.isFreeTime()) return false;
        if (!responsibilities.equals(otherChild.getResponsibilities())) return false;

        // All checks passed, objects are equal
        return true;
    }


    //Below here are all the getters and setters for the parameters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(String bestFriend) {
        this.bestFriend = bestFriend;
    }

    public boolean isFreeTime() {
        return freeTime;
    }

    public void setFreeTime(boolean freeTime) {
        this.freeTime = freeTime;
    }

    public ArrayList<String> getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(ArrayList<String> responsibilities) {
        this.responsibilities = responsibilities;
    }
}
