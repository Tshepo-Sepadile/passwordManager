package ac.za.cput.factory;

import ac.za.cput.domain.Job;

public class JobFactory {

    private static Job getJob(String jobTitle)
    {
        return new Job();
    }
}
