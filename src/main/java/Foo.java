import java.util.LinkedList;
import java.util.Objects;

class myData{
    int value;

    public myData(int value) {
        this.value = value;
    }

    static myData create(int v){
        return new myData(v);
    }

    @Override
    public String toString() {
        return "myData{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        myData myData = (myData) o;
        return value == myData.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
public class Foo {

    public static void main(String[] args) {
//        int baseNumber = 10;
//        RunSomething runSomething  = number -> number + baseNumber;

        LinkedList<myData> list = new LinkedList<>();
        list.add(myData.create(1));
        //contains에서 create한 오브젝트와 다른 오브젝트임. 이걸 같은 값인걸 알려주기위해 --> equals, hashCode를 오버라이드한다.
        list.add(myData.create(2));
        list.add(myData.create(3));

        System.out.println(list);
        // list는 tostring이 오버라이드 돼있어서 리스트안에 내용이 출력된다.
        // 반면에 Array는 주소값이 출력된다.
        // 원하는 값이 있는지 찾기위해 contains사용 -> object를 넣고 boolean타입으로 return된다.
//        System.out.println(list.contains(myData.create(3)));
        // 입력한 값인 5는 Integer.valueOf(5)와 같다.
//        System.out.println(list.indexOf(myData.create(2))); //몇번째 인덱스에 있는지 학인하기
        System.out.println(list.lastIndexOf(myData.create(2)));// indexOf는 앞에서 lastIndexOf는 뒤에서부터 찾아준다. 내가 어디서부터찾는게 유리할지 생각해서 골라쓰기.
        // ArrayList는 index로 원하는 값을 꺼낼수있기때문에 get을 할때 더 쉽게 찾아낼 수 있음.(유리하다.)
        // List interface
        // vector와 ArrayList의 차이: vector는 synchronized 값을 추가삭제할때 동기화기능이 발생.
        // ArrayList보다 오버헤드가 생길수는있지만  멀티스레드 환경에서는 데이터의 정확성(thread-safe)

    }

}
