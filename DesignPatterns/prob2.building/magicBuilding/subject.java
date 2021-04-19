package magicBuilding;

import magicBuilding.tenants.*;

public interface subject {
    void addTenant(tenant ob);
    void delTenant(String rooom);
    void notice(boolean rent, boolean option);
    void callTenant();
}
