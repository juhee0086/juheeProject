@FunctionalInterface
public interface RunSomething {

    // 추상메서드가 한개면 무조건 functional interface (abstract 생략가능)
    abstract int doIt(int number);

}
