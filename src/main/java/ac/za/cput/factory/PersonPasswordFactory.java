package ac.za.cput.factory;

import ac.za.cput.domain.PersonPassword;

public class PersonPasswordFactory {

    private static PersonPassword getPersonPassword(String passW) {
        if(passW == "12345"){
            return new PersonPassword();
        }
        return null;
    }
}
