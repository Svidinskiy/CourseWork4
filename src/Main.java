public class Main {
    public static void main(String[] args) {

        // Напишите код, с помощью которого можно разделить строку на части.

        String originalString = "Это.исходная строка.для проверки кода по.разделению строки";

        String[] parts = originalString.split("\\.");

        System.out.println(originalString);

        for (String part : parts) {
            System.out.println(part);
        }
    }
}