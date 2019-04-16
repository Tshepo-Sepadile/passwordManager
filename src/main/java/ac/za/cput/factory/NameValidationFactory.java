package ac.za.cput.factory;

import ac.za.cput.domain.NameValidation;

public class NameValidationFactory {

    private static NameValidation getNameValidation(String nameVal)
    {
        return new NameValidation();
    }
}
