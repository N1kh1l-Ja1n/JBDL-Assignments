import java.util.*;
import java.lang.*;

public class Test {

    static class Customer{
        int custId;
        String name;
        String gender;
        int age;

        public Customer(int custId, String name, String gender, int age) {
            this.custId = custId;
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "custId=" + custId +
                    ", name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    private Map<Integer, Customer> map;

    public Test() {
        map = new TreeMap<>();
    }

    public void insert(int custId, Customer cust) {
        map.put(custId, cust);
    }

    public boolean delete(int custId) {
        if (map.containsKey(custId)) {
            map.remove(custId);
            return true;
        }
        return false;
    }

    public Customer find(int custId) {
        if (map.containsKey(custId)) {
            return map.get(custId);
        }
        return null;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.insert(1, new Customer(1, "Ram", "male", 20));
        test.insert(2, new Customer(2, "Rashmi", "female", 40));
        test.insert(3, new Customer(3, "Kiran", "female", 30));
        test.insert(4, new Customer(4, "Karan", "male", 25));

        System.out.println("inserting customer with customerId as 2:");
        test.insert(5, new Customer(5,"Manoj","male",30));
        test.printMap();

        System.out.println("deleting customer with customerId as 2:");
        test.delete(2);
        test.printMap();

        System.out.println("Finding customer with customerId as 1:");
        System.out.println(test.find(1));
    }

    private void printMap() {
        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + (map.get(key)).toString());
        }
    }

}
