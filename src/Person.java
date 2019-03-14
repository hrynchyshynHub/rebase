import java.util.ArrayList;
import java.util.List;

/**
 * @author ivan.hrynchyshyn
 */
public class Person {
    private Integer age;
    private String name;
    private List<String> courses;
    private Person person;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
        courses = new ArrayList<>();

        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(String course){
      courses.add(course);
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
