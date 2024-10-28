package a01mystream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class StreamDemo1 {
    public static void main(String[] args) {
        //通过Stream流添加元素
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        list1.stream().filter(name ->  name.startsWith("张")).filter(name -> name.length() == 3).forEach(s -> System.out.println(s));


    }
}
