package tw.b2b2c.citizenuniversity2.model;

public class GuestApplicant {
    private String userId;
    private String name;
    private String address;
    private String phone;

    public boolean isAuthenticated() {
        // Authentication logic for guest
        return true;
    }

    // Getters and Setters
}