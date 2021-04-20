package magicBuilding.Building;

import magicBuilding.Tenants.*; 

public interface subject {
    void addObserver(observer ob);
    void delObserver(String room);
    void notice(String option, int monthly);
    void call();
}
