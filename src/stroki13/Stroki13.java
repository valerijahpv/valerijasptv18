
package stroki13;

public class Stroki13 {

    public static void main(String[] args) {
String word = new String ("java");
String text = "Java is a general-purpose computer-programming language that is "
        + "concurrent, class-based, object-oriented, and specifically designed to have as "
        + "few implementation dependencies as possible. ";
String[]words = text.split("\\W+");
System.out.printf(" Slov v texte = %d%n", words.length);
    }
}
