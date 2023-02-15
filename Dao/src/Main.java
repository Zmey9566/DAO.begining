public class Main {
    public static void main(String[] args) {
       Contain<String, Integer> c = new Contain("Hello", 1);
//       dao - настройка бд
//       service - непосредственноо реализуйте все методы
//
    }
}
// T - type
// V - value
// K - key

class Contain<T, T1> {
    private T value;
    private T1 value1;

    public static <T> void say(T t) {System.out.println("Hello" + t);
    }

    public Contain(T value, T1 value1) {
        this.value = value;
        this.value1 = value1;
    }

    public T1 getValue1() {
        return value1;
    }

    public void setValue1(T1 value1) {
        this.value1 = value1;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}






// Здесь хроним только String
//class Contain {
//    private String text;
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public Contain(String text) {
//        this.text = text;
//    }
//}
//
//class ContainNumber {
//    private int text;
//
//    public int getText() {
//        return text;
//    }
//
//    public void setText(int text) {
//        this.text = text;
//    }
//
//    public ContainNumber(int text) {
//        this.text = text;
//    }
//}