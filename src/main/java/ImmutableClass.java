import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    //final class so cannot be extended
    private final String name;
    private final int age;
    private final List<String> hobbies;

    //initialisation of member variables happen through constructor only
    public ImmutableClass(String name, int age, List<String>hobbies){
        this.name=name;
        this.age=age;
        this.hobbies=new ArrayList<>();
    }
    ///only getter methods and no setter methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public List<String> getHobbies(){
        return new ArrayList<>(hobbies); //return copy of mutable objects instead of directly returning them
    }

}
