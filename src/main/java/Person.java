/**
 * Created by tianjf on 2016/10/29.
 */
public class Person {

    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.setName("phoneName");
        System.out.println("The name of Phone is " + phone.getName());

        ApplePhone apple = new ApplePhone();
        apple.setName("apple ApplePhone 7plus");

        System.out.println("The name of ApplePhone is " + apple.getName());

        apple.setParentName("apple ApplePhone");
        System.out.println("The parentName of iphone is " + apple.getParentName());
    }
}
