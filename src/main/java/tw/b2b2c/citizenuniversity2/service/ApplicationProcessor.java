package tw.b2b2c.citizenuniversity2.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import tw.b2b2c.citizenuniversity2.exception.CustomException;
import tw.b2b2c.citizenuniversity2.model.*;

@Service
public class ApplicationProcessor {

    public boolean checkDuplicate(Application application) {
        // Duplicate check logic
        return false;
    }

    public void processApplication(Application application) {
        // Application processing logic
        if (checkDuplicate(application)) {
            throw new CustomException("Duplicate application detected");
        }
        ApplicationRecord record = createApplicationRecord(application);
        // Save record logic (in-memory or other)
    }

    public ApplicationRecord createApplicationRecord(Application application) {
        ApplicationRecord record = new ApplicationRecord();
        record.setApplication(application);
        record.setCreatedDate(LocalDateTime.now());
        return record;
    }
}