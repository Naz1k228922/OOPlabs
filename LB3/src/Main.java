import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть максимальну довжину рядка:");
        int maxLineLength = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        StringProcessor processor = new StringProcessor(text, maxLineLength);
        processor.processText();

        System.out.println("Результат обробки тексту:");
        System.out.println(processor.getProcessedText());
    }
}