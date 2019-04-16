package ac.za.cput.factory;

import ac.za.cput.domain.Occupation;

public class OccupationFactory {

    private static Occupation getOccupation(String occupationID) {
        if(occupationID == "005123")
        {
           return new Occupation();
        }
        return null;
    }

}
