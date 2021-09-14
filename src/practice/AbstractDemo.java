package practice;

/**
 * @author WangZY
 * @date 2021年09月13日10:28
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Salary salary = new Salary("wzy", "xindu", 3, 8000.00);
        Employee employee = new Salary("yhy", "xinan", 2, 7000.00);
        System.out.println("Call mailCheck using Salary reference --");
        salary.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference --");
        employee.mailCheck();
    }
}
