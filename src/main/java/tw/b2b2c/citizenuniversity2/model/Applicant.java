package tw.b2b2c.citizenuniversity2.model;

public class Applicant {
    private String userId;
    private String name;
    private String address;
    private String phone;

    public boolean isAuthenticated() {
        // Authentication logic
        return true;
    }

    public boolean isAuthorized(String serviceId) {
        // Authorization logic
        return true;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}