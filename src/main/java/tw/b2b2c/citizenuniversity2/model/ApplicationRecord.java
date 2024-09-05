package tw.b2b2c.citizenuniversity2.model;

import java.time.LocalDateTime;

public class ApplicationRecord {
    private String recordId;
    private Application application;
    private LocalDateTime createdDate;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}