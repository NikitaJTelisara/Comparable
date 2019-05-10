package compare;
// declare as abstract or implement all the methods
// -compareTo()
public class Employee implements Comparable<Employee> {

    int age;
    String f_name;
    String l_name;

    public Employee(int age, String f_name, String l_name) {
        this.age = age;
        this.f_name = f_name;
        this.l_name = l_name;
    }

    @Override
    public int compareTo(Employee o) {
        // assending order if f_name is same then compare age
        if (f_name.compareTo(o.f_name) == 0) {
            return age - o.age;
        } else {
            return f_name.compareTo(o.f_name);
        }
    }
}
