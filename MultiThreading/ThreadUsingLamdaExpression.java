package JavaDayFour;

//Q3)Create a thread using lambda function

// Because runnable is an functional interface we can use lamda expression here

public class QuestionThree {
    public static void main(String[] args) {


        Thread threadOne = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello World");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello World Again");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        threadOne.start();
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        threadTwo.start();
    }
}
