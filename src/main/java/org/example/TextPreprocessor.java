public class TextPreprocessor {
    public static String preprocessText(String text) {
        // Convert to lowercase
        text = text.toLowerCase();
        // Remove special characters
        text = text.replaceAll("\\W", " ");
        // Replace multiple spaces with a single space
        text = text.replaceAll("\\s+", " ");
        return text;
    }
}
