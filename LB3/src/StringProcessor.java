import java.util.Scanner;

class StringProcessor {
    private String inputText;
    private String processedText;
    private int maxLineLength;

    public StringProcessor(String inputText, int maxLineLength) {
        this.inputText = inputText;
        this.maxLineLength = maxLineLength;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String getInputText() {
        return inputText;
    }

    public String getProcessedText() {
        return processedText;
    }

    public void processText() {
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (char c : inputText.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                currentWord.append(c);
                if (currentWord.length() == maxLineLength) {
                    addWordToResult(result, currentWord);
                }
            } else if (currentWord.length() > 0) {
                addWordToResult(result, currentWord);
            }
        }

        if (currentWord.length() > 0) {
            addWordToResult(result, currentWord);
        }

        processedText = result.toString();
    }

    private void addWordToResult(StringBuilder result, StringBuilder word) {
        if (result.length() > 0 && result.charAt(result.length() - 1) != '\n') {
            result.append(" ");
        }

        if (result.length() + word.length() > maxLineLength) {
            result.append("\n");
        }

        result.append(word);
        word.setLength(0);
    }
}