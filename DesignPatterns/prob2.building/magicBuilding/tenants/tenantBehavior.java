package magicBuilding.tenants;

public interface tenantBehavior {
    void behavior();
    String speakRoom();
    int speakRent();
    int speakDownPayment();
    String speakOptions();
    boolean cancel(String str);
}
