package mvc;

import mvc.model.Person;
import mvc.model.Student;
import mvc.model.Teacher;
import mvc.view.PersonView;

public class RunMe {

    public static void main(String[] args) {
        Person s = new Student("alice", "1005892323");
        Person t = new Teacher("bob", "2312934545");

        System.out.println(PersonView.toJSON(s));
        System.out.println(PersonView.toJSON(t));
    }
}
