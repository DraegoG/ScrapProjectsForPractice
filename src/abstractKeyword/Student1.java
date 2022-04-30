package abstractKeyword;

public class Student1 extends AbstractStudent{

    @Override
    void getUp() {
        System.out.println("get up at 5AM");
    }

    @Override
    void getFreshenUp() {
        System.out.println("bath, brush teeth");
    }

    @Override
    void study() {
        System.out.println("study programming");
    }

    @Override
    void sleep() {
        System.out.println("sleep at 10PM");
    }
}
