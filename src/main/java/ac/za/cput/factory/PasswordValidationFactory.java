package ac.za.cput.factory;

import ac.za.cput.domain.PasswordValidation;

public class PasswordValidationFactory {

    private static PasswordValidation getPasswordValidation(String passwordVal)
    {
        return new PasswordValidation();
    }
}
