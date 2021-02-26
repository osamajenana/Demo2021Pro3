package CH1;

public class Student implements Person {
    private String name;
    private String major;
    private double gtade;

    public Student(String name, String major, double gtade) {
        this.name = name;
        this.major = major;
        this.gtade = gtade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGtade() {
        return gtade;
    }

    public void setGtade(double gtade) {
        this.gtade = gtade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", major=" + major + ", gtade=" + gtade + "]";
    }
    

}
