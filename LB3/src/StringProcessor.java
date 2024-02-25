import java.util.Scanner;

class StringProcessor
{
    private String inputText;
    private String processedText;
    private int maxLineLength;

    public StringProcessor(String inputText, int maxLineLength)
    {
        this.inputText = inputText;
        this.maxLineLength = maxLineLength;
    }

    public void setInputText(String inputText)
    {
        this.inputText = inputText;
    }

    public String getInputText()
    {
        return inputText;
    }

    public String getProcessedText()
    {
        return processedText;
    }

    public void processText()
    {
        StringBuilder result = new StringBuilder();
        String[] words = inputText.split("\\W+");

        int currentLineLength = 0;
        for (String word : words)
        {
            if (currentLineLength == 0)
            {
                result.append(word);
                currentLineLength += word.length();
            }
            else if (currentLineLength + word.length() + 1 <= maxLineLength)
            {
                result.append(" ").append(word);
                currentLineLength += word.length() + 1;
            }
            else
            {
                result.append("\n").append(word);
                currentLineLength = word.length();
            }
        }

        processedText = result.toString();
    }
}