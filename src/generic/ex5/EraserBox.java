package generic.ex5;

public class EraserBox<T> {

  public void instanceCheck(Object param) {
    // return param instanceof T; //오류
    // 타입소거로 인해 항상 Object instance Object가 되어버리면 참이 됨
  }

  public void craete() {
    // return new T(); //오류
    // 타입소거로 인해 항상 new ObjecT()가 생성되기 때문에 의도와 다른 로직이 실행됨
  }
}
