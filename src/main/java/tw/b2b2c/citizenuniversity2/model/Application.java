package tw.b2b2c.citizenuniversity2.model;

import java.time.LocalDateTime;

public class Application {
    private String applicationId;
    private Applicant applicant;
    private String serviceId;
    private LocalDateTime submissionDate;

    public boolean isValid() {
        // Validation logic
        return applicationId != null && applicant != null && serviceId != null && submissionDate != null;
    }

    public boolean isComplete() {
        // Completeness check logic
        return applicationId != null && applicant != null && serviceId != null && submissionDate != null;
    }

    // Getters and Setters
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public LocalDateTime getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDateTime submissionDate) {
        this.submissionDate = submissionDate;
    }
}