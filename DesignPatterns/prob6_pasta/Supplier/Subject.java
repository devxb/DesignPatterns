package prob6_pasta.Supplier;

import prob6_pasta.Pasta.Ingredients.*;

public interface Subject {
    void addObserver(Observer ingredient);
    void notice();
    void updatePrice();
    // 원래는 옵저버를 지우는 deleteObserver을 구현해야하지만, 문제상 옵저버를 지울일이 없기때문에 구현하지않는다.
}
