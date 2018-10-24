package mvc.view;

import mvc.controller.PersonController;
import mvc.model.Person;

public class PersonView {

    public static String toJSON(Person p) {
        String result = "{";
        result += "\"name\": \""  + p.getName() + "\",";
        result += "\"cpr\": \"" + p.getCpr()+ "\",";
        result += "\"age\": " + PersonController.calcAge(p);
        result += "}";
        return result;
    }
}
