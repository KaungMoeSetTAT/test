import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo("gg", "description");
        List<Demo> demoList = Arrays.asList(demo);
        System.out.println(demo);
        System.out.println(demoList.iterator().next());

        for (Demo demo1 : demoList) {
            System.out.println(demo1.getName());
        }
    }
}

class Demo {
    private String name;
    private String detail;

    public Demo(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}