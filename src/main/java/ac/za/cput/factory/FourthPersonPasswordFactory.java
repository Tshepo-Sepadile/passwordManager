package ac.za.cput.factory;

import ac.za.cput.domain.FourthPersonPassword;

public class FourthPersonPasswordFactory {

    private static FourthPersonPassword getFourthPersonPassword(String passW4) {
        if(passW4 == "1617181920"){
            return new FourthPersonPassword();
        }
        return null;
    }
}
