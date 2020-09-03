public class StaticMethodDemo {
    public static void main(String[] args) {
        StaticMethod.myStaticMethod(); // Call the static method

        StaticMethod myObj = new StaticMethod();
        myObj.myPublicMethod();
    }
}