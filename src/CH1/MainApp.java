package CH1;

public class MainApp {
    public static void main(String[] args) {
        Double data1 [] = {3.0, 5.0, 1.0, 2.0, 4.0};
        show(data1);  

        Person persons[] = {
            new Student("osama", "SE", 88.9)
            ,new Employee("Ahmed", "SD", 1000.5)
        };
        show(persons);
    }
    public static <T> void show(T data[]){
        for(T d: data){
            System.out.println(d);
        }
    }
}
