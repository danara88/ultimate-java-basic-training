package module1;

public class BEscapeCharacters {
    public static void execute() {
        String name = "Daniel Aranda \" (Is my name) \"";
        System.out.println(name);

        String path = "C:\\file\\desktop";
        System.out.println(path);

        String textWithSpace = "Lorem ipsum dolor \n sit amet";
        System.out.println(textWithSpace);

        String textWithTabs = "Lorem ipsum dolor \t sit amet";
        System.out.println(textWithTabs);
    }
}
